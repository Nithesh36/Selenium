import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchWindows {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver edge1 = new EdgeDriver();
		edge1.navigate().to("https://www.linkedin.com/feed/update/urn:li:activity:6835608760761761792/");
		edge1.findElement(By.linkText("https://lnkd.in/dU38d6_Y"));
		edge1.switchTo().activeElement();

	edge1.findElement(By.id("userName")).sendKeys("Nithesh");
		
	}

}
