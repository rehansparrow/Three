package practice.rehan;

public class OverriddingMethod extends OverriddenMethods {

	public void method1() {
		
		super.method1();
			System.out.println("Child");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverriddenMethods obj = new OverriddingMethod();
		obj.method1();
		
		
	}

}

