import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafPractice {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver6 = new EdgeDriver();
//		driver6.get("https://www.spicejet.com/");
//		WebElement radio=driver6.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
//		radio.click();
//		if(radio.isSelected()) {
//			System.out.println("selected "+(radio.isSelected()));
//		}
		
		driver6.get("https://www.amazon.in/");
		
		driver6.findElement(By.linkText("Electronics")).click();
		Actions a=new Actions(driver6);
		WebElement e=driver6.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[3]"));
		a.moveToElement(e);
		Thread.sleep(4000);
		
	//WebElement menu=driver6.findElement(By.xpath("//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-2:0\"]/div[2]/div/div[1]/ul[1]/li[1]/a"));
		WebDriverWait wait4 = new WebDriverWait(driver6, 6);		
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Laptops")));
		//menu.click();
		driver6.findElement(By.linkText("Laptops")).click();
		wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contentGrid_745689\"]/div/div[2]/div[3]/div/div/a/img")));
		driver6.findElement(By.xpath("//*[@id=\"contentGrid_745689\"]/div/div[2]/div[3]/div/div/a/img")).click();
//		driver6.findElement(By.linkText("Laptops")).click();
		//driver6.navigate().to("http://www.leafground.com/pages/Edit.html");
		//send a text using send keys 
	//	driver6.findElement(By.id("email")).sendKeys("nithesh");
		// send key with tab option
		//driver6.findElement(By.cssSelector("#contentblock > section > div:nth-child(4) > div > div > input[type=text]")).sendKeys("nive"+Keys.TAB);
		
		//get default value
//		System.out.println("default value is "+(driver6.findElement(By.name("username")).getAttribute("value")));
		//clear the text
//		driver6.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		//check   if the field is enabled or not 
//		if(	driver6.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled())
//			System.out.println("enabled");
//		else
//			System.out.println("disabled");	
	}
}
