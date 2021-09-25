package realtimeWebsite;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HotelBookingSystem {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver driver101= new EdgeDriver();	
		driver101.get("https://www.goibibo.com/");
		driver101.manage().window().maximize();
		//selecting hotel section 
		WebElement hotelMenu=driver101.findElement(By.cssSelector("a[href='/hotels/']"));
		hotelMenu.click();
		//radioBox functionality checking
		WebElement international=driver101.findElement(By.xpath("//div[@class='SearchBlockUIstyles__RadioButtonWrap-sc-fity7j-4 eEVxPE'][1]/input"));
		international.click();
		
		Robot   robot=new Robot();
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle r=new Rectangle(size);
		
		BufferedImage imgs=robot.createScreenCapture(r);
		File dest=new File("D://robots.png");
		ImageIO.write(imgs, "png", dest);
	}

}
	
