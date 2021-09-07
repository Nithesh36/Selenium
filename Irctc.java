package practice;
 		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.edge.EdgeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Irctc {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
				WebDriver driver= new EdgeDriver();		
				driver.get("https://www.irctc.co.in/nget/train-search");
				driver.manage().window().maximize();

				WebElement alert=driver.findElement(By.xpath("//button[text()='OK']"));
				alert.click();
				WebElement from=driver.findElement(By.xpath("//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
				from.click();
				WebElement tambaram=driver.findElement(By.xpath("//li//span[text()='TAMBARAM - TBM']"));
				tambaram.click();
				WebElement to=driver.findElement(By.xpath("//input[@class='ng-tns-c58-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
				to.click();
				WebElement tocity=driver.findElement(By.xpath("//li//span[text()='MGR CHENNAI CTL - MAS']"));
				tocity.click();
				WebElement seat=driver.findElement(By.xpath("//div[@class='ng-tns-c66-12 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
				seat.click();
				WebElement tatkal=driver.findElement(By.xpath("//li//span[text()='TATKAL']"));
				tatkal.click();
				
				//date
				driver.findElement(By.xpath("//input[@class=\"ng-tns-c59-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]"))
				.click();
				
				
				
				TimeUnit.SECONDS.sleep(4);
				driver.findElement(By.xpath("//a[text()='9']")).click();
				
				
				Actions a=new Actions(driver);
				
				//checkbox
				WebElement e=driver.findElement(By.xpath("//label[text()='Railway Pass Concession']"));
				WebElement e1=driver.findElement(By.xpath("//label[text()='Train with Available Berth ']"));
				
				a.clickAndHold(e1).release().clickAndHold(e).release().build().perform();
				//ac 
				JavascriptExecutor js=(JavascriptExecutor)driver;
				WebElement cls=	driver.findElement(By.xpath("//span[text()='All Classes']"));
				js.executeScript("arguments[0].click()",cls ); 
				driver.findElement(By.xpath("//span[text()='AC 3 Economy (3E)']")).click();
				driver.findElement(By.xpath("//button[text()='Search']")).click();
				
				
				
				
				

			

		
	
	}	

}
