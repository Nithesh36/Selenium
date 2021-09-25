package realtimeWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Trip_WIndowSwitching_checkBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.get("https://www.meity.gov.in/content/guidelines-indian-government-website");
		driver.manage().window().maximize();
		
	}

}
