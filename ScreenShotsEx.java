package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShotsEx {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();		
		driver.navigate().to("https://www.redbus.in/");
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\nithesh\\Desktop\\java tut\\assignment\\SeleniumDemo\\src\\Imgs\\img.png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
