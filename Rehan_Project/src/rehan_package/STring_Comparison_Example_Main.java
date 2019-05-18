package rehan_package;

public class STring_Comparison_Example_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "Selenium is my life";
		String st2 = "selenium is not my life";
		String st3 = "selenium is my life";
		
		System.out.println(st1.equals(st3));
		System.out.println(st1.equalsIgnoreCase(st3));
		System.out.println(st1.compareTo(st3));
		System.out.println(st1.compareToIgnoreCase(st3));
		System.out.println(st1 == st3);
		System.out.println(st3 == st2);
		
		System.out.println();

	}

}
