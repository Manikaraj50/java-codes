package School.org;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		 ArrayList<student>students=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
	   String name="prabha";
	   int pass=1234;
	   System.out.println("Welcome home TaminaSchool");
	   while(name.equals(name) && pass==pass){ 
		   System.out.println("Enter the Name :");
		   String UserName=sc.next();
		   System.out.println("Enter the password :");
		   int password =sc.nextInt();
	   
	   if(name.equals(UserName) && password==pass ) {
		   System.out.println("hello prabha");  
		   System.exit(0);
	   }else {
		   System.out.println("input not valid");
	   }
	   
	   
	   
	   }
	}

}
