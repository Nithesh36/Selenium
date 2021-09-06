package practice;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Myntra {

	public static void main(String[] args) throws InterruptedException {
			//1.set path for web driver.
			System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		
			//2.create a instance for web driver.

			WebDriver driver= new EdgeDriver();	
			//3.Launch a website.

			driver.navigate().to("https://www.myntra.com/");
			driver.manage().window().maximize();
			Actions mens=new Actions(driver);
			WebElement menMenu=driver.findElement(By.xpath("//a[@href='/shop/men' and @data-type]"));
			//4.open mens section menu bar 

			mens.moveToElement(menMenu).perform();
			TimeUnit.SECONDS.sleep(4);
			//5.choose jeans sub-menu

			WebElement jeans=driver.findElement(By.xpath("//li[@data-reactid='62']"));
			jeans.click();
			TimeUnit.SECONDS.sleep(4);
			//6.filter brand and choosing flying machine option

			WebElement filter1=driver.findElement(By.xpath("//section/div/div[2]/ul/li[1]/label/div"));

			filter1.click();
			//7.click view more button 

			WebElement more=	 driver.findElement(By.xpath("//div[@class='vertical-filters-filters brand-container']/div[2]"));
			more.click();
			//8.Mouse over alphabet order L 
			WebElement Levis=driver.findElement(By.xpath("//div[@class='FilterDirectory-titleBar']//li[@data-item='l']"));
			mens.moveToElement(Levis).perform();
			//9.choose lousise option

			driver.findElement(By.xpath("//div[@class='FilterDirectory-panel FilterDirectory-expanded']/div/ul/li/label[text()='Louis Philippe Jeans']")).click();
			//10.closing more options

			WebElement  closee=driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']"));
			closee.click();
			//filter black
			//section/div/div[4]/ul/li[2]
			//11.choose filter color-blue
			driver.findElement(By.xpath("//li[@class='colour-listItem'][1]/label")).click();
			//12.choose(mouse over) drop-down menu -sort-by

			WebElement sortDropDown=driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
			mens.moveToElement(sortDropDown).perform();
			//13.choose options from the drop-down menu
			WebElement optionSortMenu=driver.findElement(By.xpath("//section/div[1]/div[1]/div/div/div/ul/li[2]/label/input"));

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", optionSortMenu); 
			//14.choose one product and check whether product page is opening or not.
			WebElement BluePant=driver.findElement(By.xpath("//img[@alt='Flying Machine Men Blue Slim Tapared Micheal Fit Heavy Fade Stretchable Jeans']"));
			BluePant.click();
			String parent=driver.getWindowHandle();
			//15.getting all available windows
			List<String> windows=new ArrayList <>(driver.getWindowHandles());
			driver.switchTo().window(windows.get(1));
			//selecting size of pant
			WebElement pantSize=driver.findElement(By.xpath("//p[text()='30']"));	
			pantSize.click();
			//add to bag or cart 
			WebElement bag=driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
			bag.click();
			//check  availability of a product
			WebElement pinCodeCheck=driver.findElement(By.xpath("//input[@placeholder='Enter a PIN code']"));
			pinCodeCheck.sendKeys("641605");	
			WebElement checkBtn=driver.findElement(By.xpath("//button[text()='CHECK']"));
			checkBtn.click();
	}
	
}
