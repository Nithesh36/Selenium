package TestNgReportDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


class Extend {
	
	
	public static void main(String[] args) throws IOException {

		WebDriver driver;
		
	
		 ExtentTest test;
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("newReport.html");

       // create ExtentReports and attach reporter(s)
		 ExtentReports   extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        htmlReporter.config().setDocumentTitle("Demo Report");

        htmlReporter .config().setTheme(Theme.DARK);
       
       // creates a toggle for the given test, adds all log events under it    
//        extent.setSystemInfo("os", "win10 pro");
       // log(Status, details)
//	}
	
		 test = extent.createTest("titleTest", "Title Verification done");
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");		  
		driver= new EdgeDriver();	
		driver.manage().window().maximize();

		driver.get("https://github.com/");
		

	
		if(driver.getTitle().equals("Google"))
		{
		test.log(Status.PASS, "Navigated to the specified URL");
		}
		else
		{
		

		test.log(Status.FAIL,"wrong url");
		TakesScreenshot scrShot =((TakesScreenshot)driver);

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\nithesh\\Desktop\\java tut\\assignment\\SeleniumDemo\\src\\Imgs\\img.png");
		FileUtils.copyFile(SrcFile, DestFile);
		test.addScreenCaptureFromPath("C:\\Users\\nithesh\\Desktop\\java tut\\assignment\\SeleniumDemo\\src\\Imgs\\img.png");
		}
		
	
	
		extent.flush();
	}
}
