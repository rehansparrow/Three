package gollie_Pratice;

public class Test34 {
	int a; 
	public static void increment(int n) {
		System.out.println(n);
		n = n+20;
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		int x= 5;
		
		StringBuffer tx = new StringBuffer("Rehan");
		
		System.out.println(tx.append('v'));
		
		
Test34 obj = new Test34();
obj.a = x;
increment(x);
System.out.println(x);
System.out.println(obj.a);
		

	} 

}
