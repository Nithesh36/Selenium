import org.testng.annotations.Test;

public class testngGroups {
 //When they are lot of Testcase and we want to run few categories and omit few categories then in that case we will make use of grouping.
	@Test(groups="vivo")
	  public void vivo1() {
		  System.out.println("vivo1");
	  }
	  
	@Test(groups="vivo")
	public void vivo2() {
		System.out.println("vivo2");
	}
	@Test(groups="oppo")
	  public void oppo1() {
		  System.out.println("oppo1");
	  }
	  
	@Test(groups="oppo")
	public void oppo2() {
		System.out.println("oppo2");
	}
	@Test
	  public void oneplus1() {
		  System.out.println("oneplus1");
	  }
	  
	@Test
	public void oneplus2() {
		System.out.println("oneplus2");
	}
}


