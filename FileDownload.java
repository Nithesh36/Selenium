import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class FileDownload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver= new EdgeDriver();		
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		WebElement link1=driver.findElement(By.xpath("//a[text()='Download Excel']"));
		link1.click();
		Thread.sleep(3000);
		File a=new File("D:\\pictures\\Downloads");
		
		File[] files=a.listFiles();
		Thread.sleep(10);
		for (File file1 : files) {
			if(file1.getName().equals("testleaf2.xlsx"))
			{
				
				System.out.println("file downlaoded");
				break;
			}
		}
	}

}
