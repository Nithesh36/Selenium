import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ques5 {

	public static void main(String[] args) throws InterruptedException {
//window  handling 
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver tnDriver4= new EdgeDriver();	
		
		tnDriver4.get("https://www.naukri.com/");
			// open a url 
		    
		 //  tnDriver4.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		 //   tnDriver4.findElement(By.name("q")).sendKeys("happy testing"+Keys.ENTER);
		
	  String current=tnDriver4.getWindowHandle();
	  
	    tnDriver4.findElement(By.xpath("//div[normalize-space()='Recruiters']")).click();
		Set <String>win=tnDriver4.getWindowHandles();
	
        Iterator<String> iterator1 = win.iterator();  
         String s=  iterator1.next(); //first tab   -Parent tab
         String s1 = iterator1.next();

        tnDriver4.switchTo().window(s1);
        System.out.println("curr url titile "+(tnDriver4.getTitle() ));
        Thread.sleep(3000);
        tnDriver4.switchTo().window(s);
        
	}

}
