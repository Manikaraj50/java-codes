package org.task;
/*inheritance - Accesing one class properties in other (or) another class by
using extends keywords is known as inheritance*/

 /*single inheritance -combination of one parent and one child class (or) 
 one child class acquires the properties of parent class*/


public class SingleInherChild extends SingleInheritance {
	private void Office() {//c
		System.out.println("amazon");
	

	}
	
	public static void main(String[] args) {
		SingleInherChild s=new SingleInherChild();
		s.Office();
		s.employeeName("john");
		s.employeeId(12345);
		s.employeeName("sasi");
		s.employeeId(2568);
		
	}

}
