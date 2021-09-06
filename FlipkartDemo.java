import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("http://flipkart.com");
		WebElement a=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		a.click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[2]/div/div"))).perform();
		
		WebElement c=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]"));
		action.moveToElement(c).perform();
		WebElement d=driver.findElement(By.xpath("//a[normalize-space()='Bluetooth Speakers']"));
        d.click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("boAt Stone Grenade 5 W Portable Bluetooth Speaker")));
        driver.findElement(By.linkText("boAt Stone Grenade 5 W Portable Bluetooth Speaker")).click();
	}

}
