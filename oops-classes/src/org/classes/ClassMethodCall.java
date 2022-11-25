package org.classes;

public class ClassMethodCall{
//first one is box method call
   static  int VolumeBox(int l,int b,int h) {
	 int vol;
	 return vol=(l*b*h);
 }

	public static void main(String[] args) {
		int volume=VolumeBox(10,20,30);
		System.out.println(volume);
	}

	
		
	}
		



