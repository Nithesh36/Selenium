package advanceConcepts;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchWindowUsingTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
        				
            driver.get("https://www.naukri.com/");	
          
            //store parent window
		String winHandleBefore = driver.getWindowHandle();
		// store all the windows 
		Set<String> handle= driver.getWindowHandles();
		// iterate over window handles
		for(String mywindows : handle){
		// store window title of parent and child
		 String child = driver.switchTo().window(mywindows).getTitle();
		 String parent=driver.switchTo().window(winHandleBefore).getTitle();

		  if(!parent.equals(child)){
		  // switch to child window
			  
			  driver.switchTo().window(mywindows);
			  driver.close();
		}
		}
		//switching a parent window
		 driver.switchTo().window(winHandleBefore);
		  
		  //after closing popups open some link in new tab
		 //switch to that tab then do some operations
		WebElement recruitLink=driver.findElement(By.xpath("//div[normalize-space()='Recruiters']"));
		recruitLink.click();
		 Set<String> handle1= driver.getWindowHandles();
		 for(String mywindows1 : handle1)
		 {
			 if(!winHandleBefore.equals(mywindows1))
			 {
		 driver.switchTo().window(mywindows1);
		     
			 }
		 }
		 WebElement input=driver.findElement(By.name("qp"));
		 input.sendKeys("java"+Keys.ENTER);
	}

}
