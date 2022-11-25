package ts;

import java.util.Scanner;

public class logical {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int perfectNumber=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0) {
			perfectNumber=perfectNumber + i %10;
			
		}
	
	}if(perfectNumber==n) {
	System.out.println(" perfectNumber:"+ n);
	}else {
		System.out.println(" NOt perfectNumber : "+ n);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Enter the year");
//		Scanner s=new Scanner(System.in);
//		int number =s.nextInt();
//		if(number%4==0)
//			
//		{
//			if(number%100==0 && number%400==0 ) {
//				System.out.println("this year is  "+number+" century leap year");
//			}else {
//				System.out.println("leap year");
//			}
//				
//		}else
//		{
//			System.out.println("this year is  "+number+" not leap year");
//		}
	}

}
