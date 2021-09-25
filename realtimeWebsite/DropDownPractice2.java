package realtimeWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
public class DropDownPractice2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		//select using index
		Select s=new Select(driver.findElement(By.id("oldSelectMenu")));
		List<WebElement>options=s.getOptions();
		for (WebElement webElement : options) 
			System.out.println("elements are "+webElement.getText());
		s.selectByIndex(4);
		s.selectByVisibleText("Magenta");
		s.selectByValue("1");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//1.using javascript 
		String checkBoxVerify1=js.executeScript(" return document.querySelector('#oldSelectMenu').multiple").toString();
		if(checkBoxVerify1.equals("true")) 
			System.out.println("check box is multi select");
		else
			System.out.println("checkbox is not a  type of multi select");
		
		//deselect a value in a drop down
		s.selectByVisibleText(s.getOptions().get(2).getText());
				
		List<String>a2=new ArrayList<>();
		for(WebElement ele:s.getOptions())
			a2.add(ele.getText());
		Collections.sort(a2);
		for(String ele:a2)
			System.out.println(ele);
	}

}
