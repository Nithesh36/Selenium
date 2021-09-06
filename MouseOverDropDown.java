import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDropDown{
           //mouse over with DropDown .-  mouse over based dropDown working
	public static  void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver drivers1 = new EdgeDriver();	
		Actions action = new Actions(drivers1);
		drivers1.navigate().to("https://www.naukri.com/"); 
		
		Thread.sleep(3000);
		//build() //perform() 
		action.moveToElement(drivers1.findElement(By.xpath("//li[@class='mActive']/a"))).perform();
		Thread.sleep(3000);
		drivers1.findElement(By.linkText("Search Jobs")).click();
//		action.sendKeys(Keys.TAB).sendKeys(args).build().perform();
//		List<WebElement> l=drivers1.findElements(By.tagName("p"));
//	 for(WebElement links:l)
//		 System.out.println(links.getText());
//	 drivers1.close();
	}

}
