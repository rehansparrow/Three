package rehan_package;

public class String_ExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "This is Shaikh Rehan Ahmed an Automation Test Engineer.";

String s1 = new String("Great Personality");

System.out.println(s.toLowerCase());
System.out.println(s1.toLowerCase());
System.out.println(s.length());
System.out.println(s.substring(4, 15));
System.out.println(s.substring(0, 15));
System.out.println(s.contentEquals("Shaikh"));
System.out.println(s);
System.out.println(s.trim());
String temp[] = s.split(" ");
System.out.println(temp[3]);
for(int i = 0; i<temp.length;i++)
{
	System.out.print(temp[i]+" ");
	
}

	}

}
