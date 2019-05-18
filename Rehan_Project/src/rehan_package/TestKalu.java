package rehan_package;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;



public class TestKalu {
	
	int a = 20;
	static int b = 30;
	
	
 public TestKalu() {
	System.out.println("Test Subrat");
}
	
	
	public void test() {
		System.out.println("Print");
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		TestKalu subrat=new TestKalu();
		TestKalu rehan = new TestKalu();
		subrat.test();
		System.out.println(b);

		subrat.a = 40;
		System.out.println(subrat.a);
		
		System.out.println(rehan.a);
		subrat.b = 56;
		System.out.println(subrat.b);
		System.out.println(rehan.b);
		System.out.println(b);
		
		
		
	
	}


}
