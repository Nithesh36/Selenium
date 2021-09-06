package actionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotsDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		Actions acd=new Actions(driver);
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.linkText("This is a link"));
		acd.contextClick(ele).perform();
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		//robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	}

}