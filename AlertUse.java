import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertUse {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver edge3 = new EdgeDriver();
		edge3.navigate().to("http://www.leafground.com/pages/Alert.html");
		WebElement d=edge3.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		d.click();
		Alert a1=edge3.switchTo().alert();
		a1.sendKeys("nk");
		a1.accept();
		
//		WebElement click3=d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
//		click3.click();
//		
//		Alert a3=d.switchTo().alert();
//		Thread.sleep(3000);
//		a3.sendKeys("suriii");
//		a3.accept();


	}

}
