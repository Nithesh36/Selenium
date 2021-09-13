import org.testng.annotations.Test;

public class DependsonGroups {
	//used to demonstrate depend on groups
	 @Test(groups = {"FirstGroup"})
	 public void testCase1(){
	 System.out.println("Test Case 1");
	 }
	 @Test(groups = {"SecondGroup"})
	 public void testCase2(){
	 System.out.println("Test Case 2");
	 }
	 
	}
