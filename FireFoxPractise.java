import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxPractise {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumDriver\\geckodriver.exe");
				WebDriver driver11 = new FirefoxDriver();
				driver11.get("https://www.amazon.com/");
	}

}
