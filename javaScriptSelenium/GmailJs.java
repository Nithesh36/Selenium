package javaScriptSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailJs {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver edge = new EdgeDriver();
		edge.navigate().to("https://github.com/login");
	JavascriptExecutor js=(JavascriptExecutor)edge;

		edge.manage().window().maximize();
		//username
		edge.findElement(By.cssSelector("#login_field")).sendKeys("nitheshkumar0731@gmail.com");
		//password
		edge.findElement(By.cssSelector("#password")).sendKeys("nithesh0731");
		edge.findElement(By.cssSelector("input[value='Sign in']")).click();

		if(!edge.getTitle().equals("Sign in to GitHub · GitHub"))
			js.executeAsyncScript("alert('success')");
	}

}	
