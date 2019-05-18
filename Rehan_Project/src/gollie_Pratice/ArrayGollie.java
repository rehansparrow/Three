package gollie_Pratice;



public class ArrayGollie {
	
	static  int arr[] = {10, 20, 25, 50};
	int i;
	
	
	public static int gollie() {
		int max = arr[0] ;
	for(int i = 0;i<arr.length;i++) {
		
		if(arr[i]>max) {
			max = arr[i];
		}
	}
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Largest in given array is " + gollie());
	}

}
