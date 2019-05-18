package rehan_package;

public class MultiLevel_Inheritance extends Multilevel_Inheritance2{
    public void child() {
	System.out.println("child is executed");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiLevel_Inheritance obj = new MultiLevel_Inheritance();
		
		obj.grandfather();
		obj.father();
		obj.child();

	}

}
