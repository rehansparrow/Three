package gollie_Pratice;

public class ClassB extends ClassA{
	
	int a = 10;
	int b = 20;
	
	public static void classmethod() {
		System.out.println("Child");
	}
	
	public void instancemethod() {
		System.out.println("Child Instance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA drvr = new ClassB();
		System.out.println(drvr.a);
		drvr.classmethod();
		drvr.instancemethod();
		
	}

}
