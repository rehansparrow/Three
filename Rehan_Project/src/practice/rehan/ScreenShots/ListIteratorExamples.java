package practice.rehan.ScreenShots;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExamples {

	public static void main(String[] args) {
		
	LinkedList l = new LinkedList();
	
	l.add("Shaikh");
	l.add("Rehan");
	l.add("Ahmed");
	
	System.out.println(l);
	
	ListIterator ltr = l.listIterator();
	
	while(ltr.hasNext()) {
		String s = (String)ltr.next();
		
		if(s.equals("Rehan")) {
			ltr.set("Great Rehan");
		}
		else if(s.equals("Ahmed")){
			ltr.remove();
		}
	}
	System.out.println(l);	

	}

}
