import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver tnDriver2= new EdgeDriver();		      
			// open a url 
		    tnDriver2.navigate().to("http://www.tndte.gov.in/site/"); 
		    tnDriver2.manage().window().maximize();
		    tnDriver2.navigate().refresh();
	
	}

}
