package advanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindow {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
        				
            driver.get("http://www.leafground.com/pages/Windows.html");	
            String parent=driver.getWindowHandle();
            WebElement link1=driver.findElement(By.id("home"));
            driver.manage().window().maximize();		
	}

}
