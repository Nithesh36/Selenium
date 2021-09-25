package realtimeWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConditionsUse {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.navigate().to("https://www.ebay.com/sch/ebayadvsearch");
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,30);
		//WebElement news=driver.findElement(By.cssSelector("a[href='English/computer-test-demo.html']"));
		//w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='English/computer-test-demo.html']")));
		//w.until(ExpectedConditions.visibilityOf(news));
		//we can use multiple conditions in explicit wait by using above steps
		//news.click();
		//
		WebElement sele= driver.findElement(By.cssSelector("#e1-1"));
		//set  drop-down  selected to false then only we can able to select.
		boolean res=w.until(ExpectedConditions.elementSelectionStateToBe(sele, false));
		
		System.out.print("elementselect state "+res);
		//we can check if a element in the dropdown is selected or not using value retuned 
//		from  line ni 28 (res)
		Select s1=new Select(sele);
		s1.selectByIndex(3);
	}

}
