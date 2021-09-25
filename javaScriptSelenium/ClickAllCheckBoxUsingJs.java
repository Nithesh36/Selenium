package javaScriptSelenium;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickAllCheckBoxUsingJs {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver edge = new EdgeDriver();
		edge.navigate().to("https://scholarships.gov.in/fresh/newstdRegfrmInstruction");
		edge.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)edge;
		
		@SuppressWarnings("unchecked")
		List <WebElement>checks=(List<WebElement>) js.executeScript("return document.querySelectorAll(\"input[type='checkbox']\");");
		for(WebElement ele:checks) {
			if(ele.getAttribute("id").equalsIgnoreCase("myCheck1") || ele.getAttribute("id").equalsIgnoreCase("myCheck2")||ele.getAttribute("id").equalsIgnoreCase("myCheck3") )
				js.executeScript("arguments[0].click();", ele);
		}
	}

}
