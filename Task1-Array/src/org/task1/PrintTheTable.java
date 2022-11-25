package org.task1;
import java.util.*;

public class PrintTheTable {
	public static void main(String[] args) {
		int[][] value=new int[3][3];
		value[0][0]=1;
		value[0][1]=2;
		value[0][2]=3;
		value[1][0]=4;
		value[1][1]=5;
		value[1][2]=7;
		value[2][0]=2;
		value[2][1]=5;
		value[2][2]=6;
		for(int i=0;i<value.length;i++) {
			for(int j=0;j<value.length;j++) {
				System.out.print(" "+value[i][j]+" ");
			}
			System.out.println("");
		}
		List v=new ArrayList();
	       for(int i=0;i<3;i++) {
	    	   for(int j=0;j<3;j++) {
	    		 
				v.add(value[i][j]);
	    	   } 
	       }
	       System.out.println(v);
		    
		Set s=new TreeSet();
		
		
		
	}

}

