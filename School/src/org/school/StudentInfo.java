package org.school;

public class  StudentInfo implements School{
	@Override
	public void studentName(String name) {
		// TODO Auto-generated method stub
		System.out.println("the student name is "+name);
		
	}
	@Override
	public void studentId(int id) {
		// TODO Auto-generated method stub
		System.out.println("the student id is "+id);
	}
	public static void main(String[] args) {
		StudentInfo s=new StudentInfo();
		s.studentName("jona");
		s.studentId(12345);
	}

}
