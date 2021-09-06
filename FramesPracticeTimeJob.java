import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesPracticeTimeJob {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver100= new EdgeDriver();	
		driver100.get("https://beta.spicejet.com/");
		//select calender
		driver100.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n']//*[local-name()='svg']")).click();
		driver100.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-19bllq0 r-u8s1d r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']//*[local-name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='circle' and contains(@cx,'24.5')]")).click();
		
		driver100.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[5]/div[7]/div/div")).click();
		//
	//	driver100.findElement(By.xpath("//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).click();
	//	driver100.findElement(By.xpath("//span[normalize-space()='NEW DELHI - NDLS']")).click();
		
		//Actions a=new Actions(driver100);
//		WebElement e1=driver100.findElement(By.xpath("//label[normalize-space()='Train with Available Berth']"));
//		WebElement e2=driver100.findElement(By.xpath("//label[normalize-space()='Flexible With Date']"));
//		a.clickAndHold(e1).release().clickAndHold(e2).release().build().perform();
	
		
       //ads are change dynamiclly so ids also change but therir index never change  ,
		//driver100.switchTo().frame(0);  
		//here also content can vary ,but tag can never vary so it will be useful
		////driver100.findElement(By.tagName("a")).click();

}
}