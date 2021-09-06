import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstOne {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables  
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver = new EdgeDriver();		      
			// open a url 
		    driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
		    
		    // Click on the search text box and send value  
		    driver.findElement(By.name("firstName")).sendKeys("javatpoint");
		    driver.manage().window().maximize();
		    //Relative XPath starts from double forward-slash (//) and selects elements from anywhere on the webpage.
		    	
		    // -- //* - it select all elements .
		    	System.out.println("txt "+(driver.findElement(By.xpath("//*[@id]")).getTagName()));
		    	//return  a parent element
		    	System.out.println("get parentElement "+driver.findElement(By.xpath("//option/..")).getTagName());
		    //	Single slash (/) defines ancestor and descendant relationships if used in the middle. 
		   // 	For example, //div/table returns the div which contains a table object.
		 
		    	
		    	
		    	//return current target node or element-//option/.
		    	System.out.println("get parentElement "+driver.findElement(By.xpath("//option/.")).getTagName());

		    // Click on the search button  
//		    driver.findElement(By.name("btnK")).click();  
		      

		    	//get total tabs 
		        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		    	//open a new window
		        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com')");
		        //switch to tabs based on index 
		       String s= tabs.get(1);
//		        driver.switchTo().activeElement() //
		     By p=By.name("p");
		  
		        driver.findElement(By.name("q")).sendKeys("javaPoint");//searchbox
//		        driver.findElement(By.name("btnK")).getAttribute();//searchBtn
		        driver.navigate().back();
		        
//		        driver.close();

	}

}
