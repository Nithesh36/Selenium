package realtimeWebsite;
import  javaLearning.*;
//import org.testng.annotations.Test;
//
//public class NewTest1 {
//	@Test(priority = 1,groups = "grp1")
//	public void one() {
//		System.out.println("first");
//	}
//	@Test(priority = 0,groups = "grp1")
//	public void second() {
//		System.out.println("second");
//	}
//
//	@Test(priority = 2,groups = "grp2")
//	public void third() {
//		System.out.println("third");
//	}
//}
class b{
	static void v() {
		System.out.println("static");
	}
}
class NewTest1 extends PassingObjToMethod {
	
	static int a;
	

	public NewTest1(String name) {
		
	}
	public NewTest1() {
		// TODO Auto-generated constructor stub
	}
	//why we cant able to access a protected method at class level by creating obj
	//NewTest1 f=new NewTest1();
	f.pro();
	//why we cant able to aceesss a  protected member  without creating obj at cls lvl

	//accessing protected method
	void m1() {
		
		pro();
	
		
	}
	
	
	String s="apple";
	
	
static void m2() {
	//Can access only other static methods and variables.
	
//pro(); //it will give error coz pro is a non static method Cant access only other nonstatic methods 
}

static {
	a=3;
}
static {
	a=5;
}
	public static void main(String[] args)  {
		NewTest1 f=new NewTest1();
		NewTest1 f1=new NewTest1("nk");

		f.pro();
		f.m1();
		System.out.println(a);
	}
}