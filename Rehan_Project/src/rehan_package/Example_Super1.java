package rehan_package;

public class Example_Super1 extends Example_Super {
	
	
	public void method1() {
		System.out.println("Child Method");
	}
	public void innermethod() {
		super.method1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example_Super1 obj1 = new Example_Super1();

obj1.innermethod();

	}

}
