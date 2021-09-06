import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PskillTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver msEdge6 = new EdgeDriver();
		msEdge6.navigate().to("https://www.amazon.in/");
		
		//msEdge6.findElement(By.xpath("//*[@id=\"ques1\"]/div[2]/div/div/div/input")).click();
		
		//msEdge6.findElement(By.xpath("//*[@id=\"ques2\"]/div[2]/div/div/div/input")).click();

		msEdge6.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
		msEdge6.findElement(By.linkText("Movers and Shakers")).click();
	}

}
