import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GovtWebTest 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver msEdge2 = new EdgeDriver();
		msEdge2.navigate().to("https://www.tn.gov.in/tamilforensic/default.htm");
		msEdge2.findElement(By.name("lines2_b2")).click();
		Thread.sleep(2000);
		msEdge2.findElement(By.name("lines2_b3")).click();
		Thread.sleep(3000);
		msEdge2.findElement(By.name("lines2_b4")).click();
		msEdge2.findElement(By.name("lines2_b1")).click();
	}
}
