package javaScriptSelenium;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoFilljavascript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver edge = new EdgeDriver();
		edge.navigate().to("https://www.cleartrip.com/flights");

		edge.manage().window().maximize();
//		JavascriptExecutor js=(JavascriptExecutor)edge;
			//send value to dropdown
//		edge.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/input")).sendKeys("Ban");
//		Thread.sleep(3000);
//		List <WebElement>li=edge.findElements(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[2]/ul/li"));
//		for(WebElement ele:li) {
//		if(ele.getText().contains("Banglore")) {
//			ele.click();
//			break;
//		}
//		}
		WebElement From = edge.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div/input"));
		From.sendKeys("Ban");
		TimeUnit.SECONDS.sleep(30);
		List<WebElement> elements=  edge.findElements(By.xpath("//div[@class='bg-white br-4 elevation-5 p-1 p-absolute mt-1 z-50 l-0']/ul/li"));
		
		for(WebElement option:elements)
		{
			if(option.getText().equals("Bangalore, IN - Kempegowda International Airport (BLR)"));
			{
				option.click();
				break;
			}
		}
	}

}

