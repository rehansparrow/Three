package rehan_package;



public class ExceptionHandling_Throw {

	public void invokeBrowser() {
		
		try {
			System.out.println("Invoke Browser");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void loginBrowser() {
		
		try {
			System.out.println("Login Browser");
			
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
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	public void addCustomer() {
	
	try {
		System.out.println("Add Browser");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
	
	public void closeBrowser() {
		
	try {
		System.out.println("Close Browser");             
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("Test");
	}
	
	System.gc();
	


	
	
	}

}
