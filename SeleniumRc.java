import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumRc {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");		  
		WebDriver drivers2 = new EdgeDriver();	
		//when we  do multiple time navigaion  use naviage or get it will loads the next
		//url in the current url
		//drivers2.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		//drivers2.navigate().to("https://www.testandquiz.com");
		//drivers2.navigate().back();
		

//		drivers2.findElement(By.xpath("/html/body")).sendKeys(Keys.,"l");
		drivers2.get("java");
//		drivers2.navigate().to(); 
	}

}


// //select//ancestor::div[2] .. // index of the element from high to low  for   getting parent element -it also give parent grandparent

// //select//descendant::option[3]   //it give child grandChild ,subchild ....


// //option [@id='automation']//parent::select   it select immediate or exact parent - it doesn't select  grandaParent

// //select[@id="test"]//child:opt // it select child only ,it doesn't select nested child


//or  operator in xpath either return a single element or multiple elements
//option[ @id="automation" or @ value="Performance" ]

//it search for a element using first expression if it is find means it stops execution


//return webElement List
// to  return multiple elements   interchange a expression 1 and 2  like option[@ value="Performance" or @id="automation"]



//contains it  check if id or class contains specified string if  yes return that element
//option[contains(@id,"per")] -syntax - //tagname[contains(@selector,value)]




//select all specified element after the specified parent.
//select[@id="testingDropdown"]//following::div   it select all the div  element .here  select is a parent element



