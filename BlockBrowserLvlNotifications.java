package practice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BlockBrowserLvlNotifications {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");	
		Map<String,Object> edgePrefs = new HashMap<String, Object>();
		edgePrefs.put("profile.default_content_setting_values.notifications", 2);	
		EdgeOptions opt=new EdgeOptions();
		opt.setCapability("prefs", edgePrefs);

		WebDriver driver= new EdgeDriver(opt);	
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
	}

}
