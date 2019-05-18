package gollie_Pratice;

public class Test9 extends Test12{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test12 obj1 = new Test12();
		Test9 obj = new Test9();

System.out.println(obj.a+" " +"Before");
System.out.println(obj1.a+" "+"Another");
obj.a = 20;
System.out.println(obj.a+" " +"Before");
System.out.println(obj1.a+" "+"Another");
System.out.println(Test9.b);
obj.b = 30;
System.out.println(obj.b);
System.out.println(obj1.b);

System.out.println(obj);
	}

}
