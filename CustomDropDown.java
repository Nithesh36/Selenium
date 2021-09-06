import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver edge = new EdgeDriver();
		edge.navigate().to("https://demoqa.com/select-menu");
		//standard dropDown .
		//WebElement selectObj=edge.findElement( By.xpath("//*[@id='oldSelectMenu']"));
	//	Select s=new Select(selectObj );
	//s.selectByIndex(0);
		
		WebElement select=edge.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div"));
		WebDriverWait wait2 = new WebDriverWait(edge, 6);		
		wait2.until(ExpectedConditions.elementToBeClickable(select));
		select.click();
		WebElement selectItems=edge.findElement(By.xpath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]/div[1]/div/div[1]"));

		WebDriverWait wait3 = new WebDriverWait(edge, 7);

		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]")));

		selectItems .click();
	}

}
