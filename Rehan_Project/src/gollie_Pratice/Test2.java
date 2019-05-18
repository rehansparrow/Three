package gollie_Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 extends Test1{
	
	static int josephus(int n, int k) 
	{ 
	if (n == 1) 
	    return 1; 
	else
	    /* The position returned by josephus(n - 1, k)  
	    is adjusted because the recursive call  
	    josephus(n - 1, k) considers the original  
	    position k%n + 1 as position 1 */
	    return (josephus(n - 1, k) + k-1) % n + 1; 
	} 

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14; 
		int k = 2; 
		System.out.println("The chosen place is " + josephus(n, k)); 
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(	driver, 5);
		
		
	}

}
