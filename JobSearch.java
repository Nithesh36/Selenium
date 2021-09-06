import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JobSearch {

	public static void main(String[] args) {

		String home="https://www.ncs.gov.in/";
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver5= new EdgeDriver();	
	driver5.navigate().to("https://www.ncs.gov.in/");
		
	WebElement searchBtn=driver5.findElement(By.id("searchBoxCustom"));
	searchBtn.sendKeys("online jobs");
	driver5.findElement(By.className("ms-srch-sb-searchLink")).click();
	//driver5.findElement(By.linkText("Contact Us")).click();
//	driver5.navigate().to(home); //1st way to went to home page
//driver5.findElement(By.linkText("Home")).click(); //2nd way to go home page
		
	}

}
