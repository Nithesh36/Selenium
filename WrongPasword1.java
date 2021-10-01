package dataDrivens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WrongPasword1 {
  @Test
	@Parameters({"name","pas"})

  public void wrongPas(String user1,String pas) {

		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");		  
		WebDriver  d= new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter the username
		WebElement  pass=d.findElement(By.id("txtPassword"));
		WebElement 	login=d.findElement(By.id("btnLogin"));
		WebElement user=d.findElement(By.id("txtUsername"));
		user.sendKeys(user1);
		//enter the password
		
		pass.sendKeys(pas);
		//click the login button
	
		login.click();
		d.close();
  }
}
