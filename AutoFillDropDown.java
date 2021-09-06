import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoFillDropDown {
//Handling  auto suggestion dropDown
	public static void main(String[] args) throws InterruptedException {	

		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver1= new EdgeDriver();	
		driver1.navigate().to("https://www.naukri.com/");
		//searching box .
		driver1.findElement(By.className("sugInp")).sendKeys("java"); 
		Thread.sleep(3000);
		//auto suggestion drop-down handling
		driver1.findElement(By.xpath("//ul[@class='Sdrop']//li[2]//div")).click();
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//div[@class='search-btn']//button")).click(); //search box
		
		WebDriverWait d=new WebDriverWait(driver1, 3000);
//		driver1.manage().timeouts().wait()
	}

}
////javis.navigate().to("http://flipkart.com");
//WebElement a=javis.findElement(By.xpath("/html/body/div[2]/div/div/button"));
//a.click();
//WebElement b=javis.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[2]/div/div"));
//b.click();
//WebElement c=javis.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]"));
//c.click();