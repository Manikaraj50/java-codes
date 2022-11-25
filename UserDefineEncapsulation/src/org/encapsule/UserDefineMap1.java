package org.encapsule;

import java.util.*;

class UserDefine {

	private String name;
	private int id;
    private long salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
    
	
}


public class UserDefineMap1 {
	public static void main(String[] args) {
		UserDefine u=new UserDefine();
		UserDefine u1=new UserDefine();
		UserDefine u2=new UserDefine();
		
		u.setName("jona");
		u.setId(123445);
		u.setSalary(12000l);
		

		u1.setName("sin");
		u1.setId(454545);
		u1.setSalary(12546l);
		

		u2.setName("jara");
		u2.setId(9797);
		u2
		.setSalary(15000l);
		
		List<UserDefine> l=new LinkedList();
		 l.add(u);
		 l.add(u1);
		 l.add(u2);
		 
		 for (UserDefine x : l) {
			 System.out.println(x.getName());
			 System.out.println(x.getId());
			 System.out.println(x.getSalary());
			 System.out.println();
			
		}
		 
		 Set<UserDefine> s=new LinkedHashSet();
		 s.add(u);
		 s.add(u1);
		 s.add(u2);
		 for (UserDefine y : s) {
			 System.out.println(y.getName());
			 System.out.println(y.getId());
			 System.out.println(y.getSalary());
			 System.out.println();
			
		}
		 
		 Map<String,UserDefine>m=new LinkedHashMap<>();
		 m.put("manager", u);
		 m.put("teamLeader", u1);
		 m.put("teamemeber", u2);
	 
		Set<java.util.Map.Entry<String, UserDefine>> entrySet = m.entrySet();
		for (java.util.Map.Entry<String, UserDefine> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
			System.out.println(entry.getValue().getId());
			System.out.println(entry.getValue().getSalary());
			System.out.println();
			
		}
		
			
		}
			
		
		 


		 
		
		
}
	
	



