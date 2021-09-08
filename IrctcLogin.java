package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IrctcLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
			
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);
		WebElement alert1=driver.findElement(By.xpath("//button[text()='OK']"));
		alert1.click();
		//login btn
		driver.findElement(By.xpath("//a[@class='search_btn loginText ng-star-inserted']")).click();
		//wait for getting login window
		TimeUnit.SECONDS.sleep(4);
		//first name
		driver.findElement(By.cssSelector("input[id='userId']")).sendKeys("Nithesh1552");

		driver.findElement(By.cssSelector("input[id='pwd']")).sendKeys("Nithesh1552");
		//password
		
	}

}
