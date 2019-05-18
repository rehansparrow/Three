package gollie_Pratice;

public class Test4 {

	 public static void main(String[] args) 
	    {
	        Object i = new Object() // LINE A
	        {
	            public int hashCode() 
	            {
	                int a = 3, b = 5;
	                return a * b; // LINE B
	            }
	        }; 
	        System.out.println(i.hashCode()); 
	    }

}
