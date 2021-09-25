package realtimeWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuAndAlertHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.get("https://www.meity.gov.in/content/guidelines-indian-government-website");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement OrganizationMenu=driver.findElement(By.xpath("//a[text()='Organisations']"));
		act.moveToElement(OrganizationMenu).perform();
		WebElement subLink=driver.findElement(By.xpath("//a[text()='CCA']"));
		subLink.click();
		driver.switchTo().alert().accept();
		
		
		driver.close();
	}

}
