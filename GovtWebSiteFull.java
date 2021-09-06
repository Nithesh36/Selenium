package practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import multiScreenShot.MultiScreenShot;

public class GovtWebSiteFull {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
		driver.get("https://www.tnpds.gov.in/");
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(10);
		WebElement screenShot=driver.findElement(By.xpath("//table/tbody/tr/td[2]"));
		MultiScreenShot screenCapture=new MultiScreenShot("C:\\Users\\nithesh\\Desktop\\java tut\\assignment\\SeleniumDemo\\src\\Imgs\\","GovtWebSiteFull");
		screenCapture.elementScreenShot(driver, screenShot);
		screenCapture.multiScreenShot(driver);
		
		TimeUnit.SECONDS.sleep(5);

		driver.findElement(By.xpath("//table/tbody/tr/td[2]")).click();
		
		driver.findElement(By.xpath("//a[@title='Apply New Smart Card']")).click();  //New Smart Card
		WebElement a=driver.findElement(By.xpath("//*[@id=\"form:j_idt148\"]"));
		Select options=new Select(a);
		options.selectByValue("Ms.");
		WebElement name=driver.findElement(By.xpath("//*[@id=\"form:aname\"]"));
		name.sendKeys("Nive");
		name.submit();
		WebElement father=driver.findElement(By.name("form:fhname"));
		father.sendKeys("subramani");
		WebElement add1=driver.findElement(By.id("form:address1"));
		add1.sendKeys("salem");
		WebElement add2=driver.findElement(By.id("form:address2"));
		add2.sendKeys("Coimabtore");
		WebElement add3=driver.findElement(By.xpath("//input[@id='form:address3']"));
		add3.sendKeys("Chennai");
		WebElement dis=driver.findElement(By.xpath("//select[@name='form:districts' and @class='form-control']"));
		TimeUnit.SECONDS.sleep(2);

		Select option1=new Select(dis);
		option1.selectByValue("8");
		TimeUnit.SECONDS.sleep(2);

		WebElement taluk=driver.findElement(By.name("form:taluks"));

		Select option3=new Select(taluk);

		option3.selectByValue("683");
		TimeUnit.SECONDS.sleep(2);

		WebElement village1=driver.findElement(By.name("form:villages"));

		Select opt3=new Select(village1);
		opt3.selectByValue("509155");
		//pincoce
		WebElement pin1=driver.findElement(By.name("form:pin"));
		pin1.sendKeys("608001");
		//mobile no
		driver.findElement(By.name("form:mobile")).sendKeys("7540040685");
		TimeUnit.SECONDS.sleep(2);
//		WebElement cardType=driver.findElement(By.name("form:cardtype"));
		Select cardType1=new Select(driver.findElement(By.name("form:cardtype")));
		cardType1.selectByIndex(2);
		//residence type
		WebElement resType=driver.findElement(By.name("form:residenceproof"));
		Select resType1=new Select(resType);
		resType1.selectByIndex(1);
		Actions builder=new Actions(driver);
	    builder.moveToElement(driver.findElement(By.xpath("//*[@class='col-12 form-group no-mar rac_res-upld ']/input"))).click().build().perform();
		TimeUnit.SECONDS.sleep(3);
	    Runtime.getRuntime().exec("C:\\Users\\nithesh\\Desktop\\java tut\\assignment\\SeleniumDemo\\src\\practice\\upload.exe");

	
	}

}
