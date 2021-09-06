import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCmd {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver tnDriver = new EdgeDriver();		      
			// open a url 
		    tnDriver.navigate().to("http://www.tndte.gov.in/site/");  
		    WebElement menu=tnDriver.findElement(By.xpath("//ul[@id='megaST']//span[@class='menu-title'][normalize-space()='COURSES']")); 
		    Actions action=new Actions(tnDriver);
		    //mouseOver
		    action.moveToElement(menu).perform();
//		    Thread.sleep(3000);
		WebElement right=tnDriver.findElement(By.xpath("//ul[@id='megaST']//li[@id='menu-item-1544']//a"));
		action.contextClick(right).sendKeys(Keys.ARROW_DOWN).build().perform();
//		tnDriver.findElement(By.partialLinkText("Open")).click();
		
		WebElement elementOpen = tnDriver.findElement(By.linkText("Open")); /*This will select menu after right click */
		elementOpen.click();
}
}