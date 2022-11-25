package org.nestedif;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("the driver is m/u :");
		char martial=s.next().charAt(0);
		
		if(martial =='u'|| martial=='U')
		{
			System.out.println("enter the gender m/f");
			char gender=s.next().charAt(0);
		    System.out.println("enter the age:");
		    int age=s.nextInt();
		    
		    if( (gender=='m'&& gender=='M'|| age<=30)) {
		    	System.out.println("you are eligiable ");
		    }else if( (gender=='F'&& gender=='f'|| age<=30)) {
		    	System.out.println("you are eligiable ");
		    }else {
		    	System.out.println("youre not eligiable");
		    }
		}
		else if(martial =='m'|| martial=='M') {
			System.out.println("the driver is married");
		}
		
		else {
			System.out.println("not valid insurance,once for following condition");
		}
		
		
		
		
		
	}

}
