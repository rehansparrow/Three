package rehan_package;

public class ExceptionHandlingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] arr = new int[5];
			arr[0]	= 5;
			arr[1]	= 7;
			arr[2]	= 6;
			arr[3]	= 56;
			arr[4]	= 57;
			
			for(int i = 0; i<=arr.length; i++)
			{
				System.out.println(arr[i]);
			}
		}
			catch (IndexOutOfBoundsException e) {
			System.out.println("Array Exception");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			}
		 catch (Exception e) {
			System.out.println("An Exception Occured"); 
		}
		
		finally {
			System.out.println("I need it execute the test case, no matter the exception occurs or not");
		}
		

	}

} 
