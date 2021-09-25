package realtimeWebsite;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		
		driver.navigate().to("https://www.ebay.com/sch/ebayadvsearch");
		driver.manage().window().maximize();
		WebElement search1=driver.findElement(By.cssSelector("#_nkw"));
		search1.sendKeys("dress");
		WebElement search2=driver.findElement(By.xpath("//select[@name='_in_kw']"));
		Select option1=new Select(search2);
		option1.selectByValue("2");
		//WebElement exclude=driver.findElement(By.xpath("//input[name='_ex_kw']"));
		WebElement category=driver.findElement(By.xpath("//select[@name='_sacat']"));
		Select option2=new Select(category);
		option2.selectByValue("11450");
		WebElement searchincluding=driver.findElement(By.cssSelector("#LH_Sold"));
		searchincluding.click();
		WebElement pricecheckbox=driver.findElement(By.cssSelector("#_mPrRngCbx"));
		pricecheckbox.click();
		TimeUnit.SECONDS.sleep(5);
		
		WebElement minprice=driver.findElement(By.cssSelector("input[title='Enter minimum price range value']"));
		 minprice.click(); minprice.sendKeys("10");
		 
		WebElement listings=driver.findElement(By.cssSelector("#LH_Time"));
		listings.click();
		WebElement dropdown=driver.findElement(By.cssSelector("select[name='_ftrt']"));
		dropdown.click();
		Select option3=new Select(dropdown);
		option3.selectByValue("902");
		WebElement location=driver.findElement(By.cssSelector("#LH_LocatedInRadio"));
		location.click();
		WebElement country=driver.findElement(By.cssSelector("#_salicSelect"));
		Select option4=new Select(country);
		option4.selectByValue("15");
		WebElement sellers=driver.findElement(By.cssSelector("#_fss"));
		sellers.click();
		WebElement inex=driver.findElement(By.cssSelector(".from_sellers_aspect_select"));
		Select option5=new Select(inex);
		option5.selectByValue("2");
		WebElement type=driver.findElement(By.cssSelector("#_sasl"));
		type.sendKeys("dress");
		WebElement sortby=driver.findElement(By.cssSelector("select[name='_sop']"));
		Select option6=new Select(sortby);
		option6.selectByValue("10");
		WebElement viewresults=driver.findElement(By.cssSelector("select[name='_dmd']"));
		Select option7=new Select(viewresults);
		option7.selectByValue("7");
	}
}
		