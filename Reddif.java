package practice;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reddif {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");	
		
		
		
		Map<String,Object> edgePrefs = new HashMap<String, Object>();
		edgePrefs.put("profile.default_content_setting_values.notifications", 2);	
		EdgeOptions opt=new EdgeOptions();
		opt.setCapability("prefs", edgePrefs);

		WebDriver driver= new EdgeDriver(opt);	
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement crateAc=driver.findElement(By.xpath("//a[contains(text(),'Create Account')]"));
		crateAc.click();	
		//		TimeUnit.SECONDS.sleep(3);
		//fullname
		
		driver.findElement(By.cssSelector("form table:nth-child(3)  tr:nth-of-type(3)>td>input")).sendKeys("Nithesh");
		
		//mail
		driver.findElement(By.cssSelector("form table:nth-child(3)  tr:nth-of-type(7) td>input:nth-of-type(1)")).sendKeys("nitheshkumar0731");
		
		//password
		driver.findElement(By.xpath("//tbody/tr[9]/td[3]/input")).sendKeys("Apple@25");
		//cnfrm password
		driver.findElement(By.xpath("//tbody/tr[11]/td[3]/input	")).sendKeys("Apple@25");
		TimeUnit.SECONDS.sleep(3);	
		//checkbox
		//	driver.findElement(By.xpath("//tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		//alter email
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input")).sendKeys("nitheshkumar473");

		//mobile 
		TimeUnit.SECONDS.sleep(3);	
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("7540040685");
		TimeUnit.SECONDS.sleep(3);
		//day of dob
		WebElement selec=driver.findElement(By.xpath("//tr[22]/td[3]/select[1]"));

	
		Select day=new Select(selec);
		day.selectByIndex(2);

		//month of dob
		WebElement selec1=driver.findElement(By.xpath("//tr[22]/td[3]/select[2]	"));	
		Select month=new Select(selec1);
		month.selectByIndex(2);
		//year of dob
		WebElement selec2=driver.findElement(By.xpath("//tr[22]/td[3]/select[3]"));	
		Select year=new Select(selec2);
		year.selectByIndex(2);
		//country
		WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));	
		Select cn=new Select(country);
		cn.selectByValue("99");
		//city
		WebElement city=driver.findElement(By.xpath("//tr[1]/td[3]/select"));	
		Select city1=new Select(city);
		city1.selectByIndex(2);
	

		
	}

}
