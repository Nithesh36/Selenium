	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	
	public class question1 {
	
		public static void main(String[] args) {
	
			
			System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
			WebDriver msEdge = new EdgeDriver();
			msEdge.navigate().to("https://demoqa.com/select-menu");
			String titles=msEdge.getTitle();
			int titleLength=titles.length();
			
			System.out.println("title of the url is "+titles);
			System.out.println("length of the url is "+titleLength);
			System.out.print("no of page source "+(msEdge.getPageSource().length()));
		}
	
	}
