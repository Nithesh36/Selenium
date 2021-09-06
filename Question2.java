import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Question2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver msEdge1 = new EdgeDriver();
		msEdge1.navigate().to("https://demoqa.com/");
		String actualUrl="https://demoqa.com/";
		if(actualUrl.equals(msEdge1.getCurrentUrl())) {
			System.out.println("both url are same");
		}
	}

}
