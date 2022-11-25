package org.classes;
  
    //the reference of box 

  class box{
	int length;
	int breath;
	int height;
  }

public class classes {
	public static void main(String[] args) {
		box blackBox =new box();
		blackBox.length=10;
		blackBox.breath=20;
		blackBox.height=30;
		blackBox.length=50;
		System.out.println(blackBox.length);
		
			}

}
