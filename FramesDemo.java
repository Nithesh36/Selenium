import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver10= new EdgeDriver();	
		driver10.get("http://www.leafground.com/pages/frame.html");
		//1st parent here no child it means no nested frames
		driver10.switchTo().frame(0);
		driver10.findElement(By.id("Click")).click();
		driver10.switchTo().defaultContent();
		//3rd parent
		driver10.switchTo().frame(1);
		driver10.switchTo().frame(0); 
		driver10.findElement(By.id("Click1")).click();

		
		//for child frame code
		driver10.switchTo().defaultContent();
       System.out.println( driver10.findElements(By.tagName("iframe")).size());
       //it ignores child count

	}

}
