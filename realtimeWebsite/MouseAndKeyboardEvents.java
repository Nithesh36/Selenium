package realtimeWebsite;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardEvents {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();		
		driver.get("https://www.apollohospitals.com/");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.cssSelector("#search"));
		Actions actions=new Actions(driver);
		actions.keyDown(textbox, Keys.SHIFT).sendKeys("child psychologist").build().perform();
		//choosing option from searchlist
		WebElement  hospital=driver.findElement(By.cssSelector("a[href='https://www.apollohospitals.com/doctor-achieve-speciality/child-psychologist/']"));
		hospital.click();
	}

}
