package rehan_package;



public class ExceptionHandling_ThrowReal {

	public void invokeBrowser() throws Exception
	{
		
	
			System.out.println("Invoke Browser");
		
		
	}
	
	public void loginBrowser() throws Exception {
		
		
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
		
		
		
		
	}

	public void addCustomer() throws Exception{
	
	
		System.out.println("Add Browser");
	
}
	
	public void closeBrowser() throws Exception {
		
	
		System.out.println("Close Browser");
	
	 


	
	
	}

}
