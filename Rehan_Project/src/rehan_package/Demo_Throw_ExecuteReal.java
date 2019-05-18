package rehan_package;

public class Demo_Throw_ExecuteReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionHandling_ThrowReal eh = new ExceptionHandling_ThrowReal();
		
		try {
			eh.invokeBrowser();
			eh.loginBrowser();
			eh.addCustomer();
			eh.closeBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
