package practice.rehan.ScreenShots;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExamples {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		for(int i= 0; i<=10;i++) {
			al.add(i);
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
		if(i%2==0) {
			System.out.print(i);
			
		}
		else {
			itr.remove();
		}
		
		}
		System.out.println("");
		System.out.println(al);
	}

}
