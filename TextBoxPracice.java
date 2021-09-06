import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TextBoxPracice {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver mydriver= new EdgeDriver();	
		mydriver.get("https://demoqa.com/text-box");
		WebElement name=mydriver.findElement(By.id("userName"));
		name.sendKeys("Nithesh");
		WebElement email=mydriver.findElement(By.id("userEmail"));
		email.sendKeys("nithesh25@gmail.com");
		WebElement address=mydriver.findElement(By.id("currentAddress"));
		address.sendKeys("tirupur");
		WebElement permanenetAdderess=mydriver.findElement(By.id("permanentAddress"));
		permanenetAdderess.sendKeys("tirupur");
		WebElement subtBtn=mydriver.findElement(By.id("submit"));
		subtBtn.click();
	}

}
