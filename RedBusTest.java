package practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class RedBusTest{
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
	WebDriver driver= new EdgeDriver();		
	driver.navigate().to("https://www.redbus.in/");
	//maximize window
	driver.manage().window().maximize();
	//enter from place
	WebElement from=driver.findElement(By.xpath("//*[@id=\"src\"]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	from.click();
	from.sendKeys("E");
	TimeUnit.SECONDS.sleep(5);
	driver.findElement(By.xpath("//li[text()='Erode']")).click();
	WebElement to=driver.findElement(By.xpath("//input[@id='dest']	"));
	to.click();
	to.sendKeys("c");
	TimeUnit.SECONDS.sleep(5);
	//calender box
	driver.findElement(By.xpath("//*[@id='onward_cal']")).click();
	//selecting  date
	WebElement date=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[5]"));
    date.click();
    //searching 
    WebElement search=driver.findElement(By.xpath("//button[@id='search_btn']"));
    search.click();
    TimeUnit.SECONDS.sleep(10);
    //closing popups
    driver.findElement(By.xpath("//*[@id='root']/div/div[3]/div[1]/i")).click();
    //applying filters
    driver.findElement(By.xpath("//div[@class='button view-seats fr']")).click();
    
    WebElement deptTime=driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[2]/li[1]"));
    js.executeScript("arguments[0].click()",deptTime ); 

   
    WebElement busType=driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[4]/li[2]/label[1]"));
    
    js.executeScript("arguments[0].click()",busType ); 
	}
}