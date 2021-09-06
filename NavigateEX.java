import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigateEX {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver drivers = new EdgeDriver();	
		drivers.navigate().to("https://www.testandquiz.com/selenium/testing.html");
	// navigate or go to previous  visited link 
		//drivers.navigate().back();
		//drivers.navigate().forward();	
	//WebElement attr=	drivers.findElement(By.name("search"));
	//	System.out.println(attr.getAttribute("id")); //getAttribute used to get Some attribute value which accepts
		//selector as a argument type is string.
//		drivers.close();
		
		//dropDown 
		
		//select a  option from select tag
		// 1.get select tag and pass it as a parameter  to  select class 
		//2. Select s=new Select(webelement(select tag));
		//getOptions() -used get all option tags in the select tag
		
		WebElement testDropDown = drivers.findElement(By.id("testingDropdown"));  
		//selecting all the dropdown values and print
		List<WebElement> dropdown =  new Select(testDropDown).getOptions(); 
		for(WebElement ele:dropdown) {
			System.out.println(ele.getText());
		}
	}

}
