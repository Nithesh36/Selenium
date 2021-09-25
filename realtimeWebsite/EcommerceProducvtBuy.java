package realtimeWebsite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import multiScreenShot.MultiScreenShot;

public class EcommerceProducvtBuy {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			//find broken images
			/*
			 * //if (img.getAttribute("naturalWidth").equals("0")) {
			 * System.out.println(img.getAttribute("outerHTML") + " is broken.");
			 * iBrokenImageCount++; }
			 */
		
		//test1249@test.com
		//PKR@PKR
		//1. Login to the website.
		WebElement signin=driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		signin.click();
		
		WebElement email=driver.findElement(By.cssSelector("input[id='email']"));
		email.sendKeys("test1249@test.com");
		//password
		WebElement pssword=driver.findElement(By.cssSelector("input[id='passwd']"));
		pssword.sendKeys("PKR@PKR");
		//2	. Move your cursor over Women's link.
		//3
		WebElement login=driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		login.click();
		WebElement womenSec=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]"));
		Actions act=new Actions(driver);
//		Thread.sleep(4);

		act.moveToElement(womenSec).perform();
		
		WebDriverWait w=new WebDriverWait(driver, 8);
		WebElement tshirt=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[1]//li[1]//descendant::a[text()='T-shirts']")));
		
		tshirt.click();
		
		WebElement product=driver.findElement(By.cssSelector("img[alt='Faded Short Sleeve T-shirts']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product);
		act.moveToElement(product).perform();
		//more button
		WebElement more=driver.findElement(By.xpath("//span[text()='More']"));
		more.click();	
		//double click
		WebElement quantityIncrease=driver.findElement(By.cssSelector(" a.product_quantity_up span"));
		act.doubleClick(quantityIncrease).perform();
		MultiScreenShot screenShot=new MultiScreenShot("C:\\Users\\nithesh\\Desktop\\java tut\\assignment\\SeleniumDemo\\src\\Imgs","EcommerceProducvtBuy" );
		screenShot.multiScreenShot(driver);
	}

}
