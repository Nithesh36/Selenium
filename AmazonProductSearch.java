import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonProductSearch {
//Error fixed: line no 16
//	           Errorname:element intercepted  other element would receive click
			   // use  other element tag or its id;
	public static void main(String[] args) {
 
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver amazonEdge= new EdgeDriver();
		amazonEdge.navigate().to("https://www.amazon.com//");
		WebElement searchbox=amazonEdge.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("apple"+Keys.ENTER);
		WebElement filterBox=amazonEdge.findElement(By.xpath("//*[@id=\"p_n_cpf_eligible/21512497011\"]/span/a/div/label/i"));
		filterBox.click();
	}
}
