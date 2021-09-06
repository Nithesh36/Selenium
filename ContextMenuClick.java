import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuClick {

	public static void main(String[] args) throws AWTException {

		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver101= new EdgeDriver();	
		driver101.get("https://www.javatpoint.com/");
		WebElement e=driver101.findElement(By.xpath("//div[@class='ddsmoothmenu']//ul//li//a[@href='php-tutorial'][normalize-space()='PHP']"));
	String parent=driver101.getWindowHandle(); //it prints currentlny focused window
	Actions a=new Actions(driver101);
	a.contextClick(e).perform();
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);

	
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Set <String> windows=driver101.getWindowHandles();
		for(String win:windows)
			if(!win.equals(parent))
				driver101.switchTo().window(win);
	System.out.println("title "+(driver101.getTitle()));
	}

}


