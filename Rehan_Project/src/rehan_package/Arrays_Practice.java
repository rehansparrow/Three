package rehan_package;

public class Arrays_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	//declaration	
		int[] a;
		Instantiation
		a = new int(5);
		Initialization
		a[0] = 20;
		
*/		
	//Direct Process 
	int[] a = {10, 20, 30};
	 int b[] = {25, 67, 89, 8};
	//First Approach to print 
	System.out.println(a[0]);
	
	//Second approach 
	for(int i=0; i< a.length;i++) {
		System.out.println(a[i]);
	}
	
	//Third Approach 
		for (int aa: a)
		{
			System.out.println(aa);
		}
System.out.println(b.getClass());
}
	
}
