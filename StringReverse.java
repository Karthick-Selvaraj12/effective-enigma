package GitUploads;

import java.util.Scanner;

public class StringReverse {
	String content="the car";
	static String contents;
	String newContent="";
	
	public void stringReverse() {
		System.out.println("enter text in output field to be reversed");
		 Scanner sc=new Scanner(System.in);
		 contents=sc.nextLine();
		for (int i = contents.length()-1; i >=0; i--) {
			
			 newContent+=contents.charAt(i);
		}
		System.out.println(newContent);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
           StringReverse obj=new StringReverse();
           obj.stringReverse();
          
	}

}
