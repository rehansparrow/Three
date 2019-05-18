package gollie_Pratice;

public class Test35 {
	
	public void finalize() {
		System.out.println("Garbage");
		
	}

	public static void main(String[] args) {

		Test35 obj = new Test35();
		Test35 obj1 = new Test35();
		Test35 obj2 = new Test35();
		obj = obj1;
		obj2 = null;
		
		
		System.gc();
		
		System.out.println(obj);
		System.out.println(obj1);
		

	}

}
