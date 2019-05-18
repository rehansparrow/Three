package gollie_Pratice;

public class Test15 {
	
	
	static int arr[] = new int[]{1, 2, 3, 4}; 

	public static void main(String[] args) {
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<=arr.length;j++) {
				
				for(int k=i;k<=j;k++) {
				System.out.print(arr[k]+" ");
				}
				System.out.println();				
			}
			
		}

	}

}
