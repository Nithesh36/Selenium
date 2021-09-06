package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailBoxVerify {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.get("https://www.google.com/");
		//Set implict wait to 0
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//check existence
		
		if(driver.findElements(By.xpath("//a[text()='Gmail']")).size()>0) {
			System.out.print("element exist");
		}
		else
			System.out.println("element not exist");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

}
