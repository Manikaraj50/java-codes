package org.variablelength;

public class VariableLength {
	
	static char minValue(char... vals) {
		char min=Character.MAX_HIGH_SURROGATE;
		for(char x: vals) {
			if(x<min)
				min=x;
			
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		int m=minValue('c','a','s');
		System.out.println(m);
		
	}

}
