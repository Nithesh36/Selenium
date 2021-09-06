package actionClass;
import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowPopUpHandle {				
  //popupWindow handle
    public static void main(String[] args) throws InterruptedException {									
    	System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();	
        				
            driver.get("https://www.naukri.com/");			
            driver.manage().window().maximize();		
                		
            String mainWindow=driver.getWindowHandle();		
        		
        // To handle all child windows				
            Set<String> s1=driver.getWindowHandles();		
            Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();
            		
            if(!mainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           			
                                 
                    // Closing the Child Window.
                    driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            		driver.switchTo().window(mainWindow);				
    }
}	