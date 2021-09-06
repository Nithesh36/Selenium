import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver drivers = new EdgeDriver();	
		drivers.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		Select dropDown=new Select(drivers.findElement( By.id("testingDropdown")));
		dropDown.selectByIndex(0);
		dropDown.selectByIndex(3); //if it is multiple attribute true we can select multiple 
		//dropdown using  getAllSelectorOptions
		dropDown.getAllSelectedOptions();
		
		//getFirstSelection either select first selection or currently selected item.
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		/*	WebElement testDropDown = drivers.findElement(By.id("testingDropdown"));  
				selecting all the dropdown values and print
		List<WebElement> dropdown =  new Select(testDropDown).getOptions(); 
		for(WebElement ele:dropdown) {
			System.out.println(ele.getText());
		} */
	}

}
