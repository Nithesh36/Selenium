package testNgDemo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTest {
	@Test
	@Parameters("List1")
	 public void testCase1(String name1){
	 System.out.println("Name is " +name1);
	 }
	 @Test
	 @Parameters("List2")
	 public void testCase2(String name2){
	 System.out.println("Other name is " +name2);
	 }

}