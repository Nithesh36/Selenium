import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class FramesPracticeNic
{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.get("https://www.nic.in/state-office/");
		driver.manage().window().maximize();
		
		//selecting a state 
//		By Header=By.xpath("//h1");
//		driver.findElement(Header).click();
		WebElement select1;
		WebElement select=driver.findElement(By.cssSelector("#stateoffice"));
		Select s=new Select(select);
		s.selectByIndex(2);
		WebElement framePdf=driver.findElement(By.cssSelector(".pdfjs-viewer"));
		TimeUnit.SECONDS.sleep(15);
		driver.switchTo().frame(framePdf);
		//download file
		
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", framePdf);
		driver.findElement(By.cssSelector("#download")).click();
		
}}