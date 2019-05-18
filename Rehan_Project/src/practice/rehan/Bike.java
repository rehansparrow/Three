package practice.rehan;

public class Bike {
	
	static int speed1 =400;
	  int speed = 100;
	
	Bike(){
		System.out.println("Construtor"+ speed);
	}
	static{
		System.out.println("Static"+speed1);
	}
	
//Initializer Block is executed before the Constructor
	{
		speed = 500;
		System.out.println("Initializer 1 "+speed);
	}
	{
		speed = 1000;
		System.out.println("Initializer 2 "+speed);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Bike b1 = new Bike();
	}

}
