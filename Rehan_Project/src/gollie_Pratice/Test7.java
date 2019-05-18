package gollie_Pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) throws IOException {


		  Scanner sc=new Scanner(System.in);
	        System.out.println("================================");
	        for(int i=0;i<3;i++){
	            String s1=sc.next();
	            int x=sc.nextInt();
	           System.out.printf("%-15s%03d%n",s1,x);
	        }
	        System.out.println("================================");
	    }
	
	
	}


