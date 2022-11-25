package org.task1;

import java.util.*;
import java.util.Map.Entry;

public class Classs {
      public static void main(String[] args) {
		int [] s= {1,2,3,4,5};
		
	for(int x:s) {
		System.out.println(x);
			}
	List <Integer>l=new ArrayList <Integer>();
	for(Integer y:s) {
		l.add(y);
	}
	System.out.println(l);
	
      		
      Set <Integer> m=new LinkedHashSet <Integer>();
      m.addAll(l);
      System.out.println(l);
      
      Map<String, Integer> k=new LinkedHashMap<>();
      
      for (Integer y : s) {
    	  k.put("jona", y);
    	  Set<Entry<String, Integer>> entrySet = k.entrySet();
    	  System.out.println(entrySet);
    	  
		
	}
}
}
      
     
