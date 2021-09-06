import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUse {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver drivers9 = new EdgeDriver();	
		drivers9.navigate().to("https://www.nexsoftsys.com/articles/mouse-keyboard-events-selenium-webdriver.html");
		
		Actions acd=new Actions(drivers9);
//		WebElement ele=drivers9.findElement(By.linkText("This is a link"));
//		acd.contextClick(ele).keyDown()
		WebElement para=drivers9.findElement(By.xpath("/html/body/div[4]/div[1]/ul[3]/li[3]/p[1]"));
		acd.keyDown(para, Keys.SHIFT);
		
	}

}
