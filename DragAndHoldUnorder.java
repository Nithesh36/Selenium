import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndHoldUnorder {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver tnDriver44= new EdgeDriver();	
		
		tnDriver44.get("https://www.mha.gov.in/");
		Actions act=new Actions(tnDriver44);
		WebElement abt=tnDriver44.findElement(By.linkText("Media"));
		//WebDriverWait abtWait=new WebDriverWait(tnDriver44, 3000);
		//abtWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='accessible-megamenu-1629951237569-2']")));
		 act.moveToElement(abt);
		 
	List<WebElement> lis=tnDriver44.findElements(By.xpath("//*[@id='main_menu']/ul/li[2]/dv/ul[1]/li"));
	act.clickAndHold(lis.get(0));
	act.clickAndHold(lis.get(1));
	act.build().perform();
	}

}
