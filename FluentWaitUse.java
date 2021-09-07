package practice;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitUse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();		
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		//email
		WebElement email=driver.findElement(By.cssSelector("input[placeholder='Email']"));
		email.sendKeys("user@phptravels.com");
		//password
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("demouser");
		TimeUnit.SECONDS.sleep(3);
		//submit btn
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")).click();
		//fluent-wait and profile button
		Wait <WebDriver>f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement profile=f.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.cssSelector("li a[href='https://www.phptravels.net/account/profile']"));
			}
		});
		profile.click();
	}

}
