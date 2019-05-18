package rehan_package;

public class ClassB extends ClassA{
	
	public void inherit() {
		System.out.println("I am B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			ClassA obj = (ClassB) new ClassB();
			obj.inherit();
		
		
		

	}

}
