import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class quest3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver tnDriver1 = new EdgeDriver();		      
			// open a url 
		    tnDriver1.navigate().to("http://www.tndte.gov.in/site/"); 
		    tnDriver1.navigate().to("http://www.leafground.com/pages/checkbox.html");
		    tnDriver1.navigate().back();
		    tnDriver1.navigate().forward();
	}

}
