package realtimeWebsite;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindowCloseChild {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.get("https://tnsta.gov.in/homepage");
		//
		Actions a=new Actions(driver);
		//menu
		WebElement menu=driver.findElement(By.xpath("//a[text()='Departmental Login ']"));
		a.moveToElement(menu);
		//login menu
		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement login=driver.findElement(By.xpath("//a[text()='Administrator Login']"));
		js.executeScript("arguments[0].click()", login);
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		//user name
		WebElement username=driver.findElement(By.cssSelector("#username"));
		js.executeScript("arguments[0].value='Nithesh'", username);
		//password
		WebElement password=driver.findElement(By.cssSelector("#pswd"));
		js.executeScript("arguments[0].value='Nithesh25' ", password );
		TimeUnit.SECONDS.sleep(30);
		//close  will close the current tab is focussed so here child window will closed
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}

}
