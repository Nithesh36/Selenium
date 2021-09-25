package realtimeWebsite;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownPlay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		//check if  dropdown is multi select or not
		Select s=new Select(driver.findElement(By.id("cars")));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		//1.using javascript 
	String checkBoxVerify=js.executeScript(" return document.querySelector('#oldSelectMenu').multiple").toString();
	// 2 way  using  Boolean verify= s.isMultiple()
	if(checkBoxVerify.equals("true"))
		System.out.println("dropdown is multiselct");
	else 
		System.out.println("no multiselct");
		Actions act=new Actions(driver);
		WebElement saab=driver.findElement(By.xpath("//option[text()='Saab']"));
		WebElement vo=driver.findElement(By.xpath("//option[text()='Volvo']"));
		js.executeScript("window.scrollBy('0','650')");
		//customized dropdown
		
		//1.customized way to selet multiple options in a dropdown
		//act.keyDown(Keys.CONTROL).click(vo).click(saab).build().perform();
		//2.way using select class and getallselectedOptions() -it will fetch all the selected options
			s.selectByIndex(0);
			s.selectByIndex(1);
			List<WebElement>list=s.getAllSelectedOptions();
			TimeUnit.SECONDS.sleep(5);
			//get which options are selected and  print it in the console
			for (WebElement webElement : list) {
				System.out.println(webElement.getText());
			}
			//get a first selected options recently
			System.out.println(s.getFirstSelectedOption().getText());
			//deselecting all
			
			s.deselectAll();
			//select each and every drop down item by iterating
			List<WebElement> ele=s.getOptions();
			for(WebElement ele1:ele)
				s.selectByVisibleText(ele1.getText());
			s.getAllSelectedOptions();
			
	}

}
