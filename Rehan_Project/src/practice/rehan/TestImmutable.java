package practice.rehan;

import org.testng.Assert;

public class TestImmutable {

	public static void main(String[] args) {
   
		String a = "Rehan";
		String b = "Rehan";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		String c = new String("Rehan");
		
		a = "rehan hello";
		System.out.println(a);
		System.out.println(a.length());
		//System.out.println());
		String date = "01.12.22018";
		
		System.out.println(date.replace("01.12.22018", "01/12/22018"));
		System.out.println(date.replace(".", "/"));
		 
		String kalu = " Subrat Senapati";
		System.out.println(kalu.trim());
		System.out.println(kalu.replace(" ", ""));
		
		

	}

}
