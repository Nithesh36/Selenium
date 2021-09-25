package realtimeWebsite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavascriptExecutorsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.navigate().to("https://www.javatpoint.com/");
		driver.manage().window().maximize();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 String title=js.executeScript("return document.title;").toString();
		 System.out.println("tiltle of the page is "+title);
		 String childValueRetrieve="return document.getElementById(\"smoothmenu1\").firstElementChild.firstElementChild";
		 WebElement childNodeValue=(WebElement) js.executeScript(childValueRetrieve);
		 System.out.println("child node value "+childNodeValue.getText());
		 String homeClick="document.getElementById('smoothmenu1').firstElementChild.childNodes[5].click()";
		 js.executeScript(homeClick);
	}
	
}
