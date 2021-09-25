package realtimeWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeybaordOperations {
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
	WebDriver driver= new EdgeDriver();	
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement userName=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
    
    userName.sendKeys("Yuvaraj");
    
    Actions actions=new Actions(driver);
    // Select the username and copying it by using ctrl+a and ctrl+c by using keydown, sendkeys and releasing ctrl using keyup.
    actions.keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
    actions.sendKeys(Keys.TAB).perform();//To go to next field.
    actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();//pasting the user-name.
//actions
	}
}
//hey ena panra