package org.Type2;

public class parentclass {

	public  void fatherName() {
		System.out.println("Father name is Sarvanan");
	}
	
	public void motherName() {
		System.out.println("Mother name is Lakshmi");
	}
	
	public static void main(String[] args) {
		
		parentclass p = new  parentclass();
		p.fatherName();
		p.motherName();
		
	}
}
