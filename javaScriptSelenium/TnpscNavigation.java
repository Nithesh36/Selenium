package javaScriptSelenium;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge	.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TnpscNavigation {

	public static void main(String[] args) {
//
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver edge = new EdgeDriver();
		edge.navigate().to("http://html5doctor.com/the-contenteditable-attribute/");
		edge.manage().window().maximize();
		//check content editable
		JavascriptExecutor js=(JavascriptExecutor)edge;
		WebElement ele=edge.findElement(By.cssSelector("#example-one"));
		if(ele.getAttribute("contenteditable").equals("true")) {
			System.out.println("contents are editable");
			js.executeScript("document.querySelector('#example-one>figure').innerText='welcome' "	);
		}
		//get the source of particluar element
		
		System.out.println(ele.getAttribute("outerHTML"));
//		WebElement rank=edge.findElement(By.xpath("//a[contains(text(),'RANK LIST_AD-ASSISTANT DIRECTOR')]"));
//		WebDriverWait w=new WebDriverWait(edge, 10);
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'RANK LIST_AD-ASSISTANT DIRECTOR')]")));
//		rank.click();
//		ArrayList<String>a=new ArrayList<>( edge.getWindowHandles());	
//		//switch to next window
//		edge.switchTo().window(a.get(1));
//		edge.findElement(By.xpath("//a[text()='Tenders']")).click();
//		//switch to parent window
//		edge.switchTo().window(a.get(0));
	}

}
//yyyy-MM-dd (ISO)	“2018-07-14”
//dd-MMM-yyyy	“14-Jul-2018”
//dd/MM/yyyy	“14/07/2018”
//E, MMM dd yyyy	“Sat, Jul 14 2018”
//h:mm a	“12:08 PM”
//EEEE, MMM dd, yyyy HH:mm:ss a	“Saturday, Jul 14, 2018 14:31:06 PM”
//yyyy-MM-dd'T'HH:mm:ssZ	“2018-07-14T14:31:30+0530”
//hh 'o''clock' a, zzzz	“12 o’clock PM, Pacific Daylight Time”
//K:mm a, z	“0:08 PM, PDT”