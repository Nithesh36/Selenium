package practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class PdfFileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.get("https://smallpdf.com/compress-pdf");
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(20);
		Actions a=new Actions(driver);
		WebElement btn=driver.findElement(By.xpath("//div[@class='l3tlg0-6 dKjQAB']/button[1]"));
		a.moveToElement(btn).click().build().perform();
		
	   Runtime.getRuntime().exec("C:\\Users\\nithesh\\Desktop\\java tut\\assignment\\SeleniumDemo\\src\\practice\\upload.exe");
	}

}
