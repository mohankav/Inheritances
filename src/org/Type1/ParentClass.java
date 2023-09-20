package org.Type1;

public class ParentClass {

	public void studentName() {
		System.out.println(" Student Name is  Kaaviyan");
	}
	
	public void studentId() {
		System.out.println(" Studen Id is 15Me39");
	}
	
	public void studentAddress() {
		System.out.println(" Student Address is Salem");
	}
	
	public static void main(String[] args) {
		
		ParentClass s = new ParentClass();
		
		s.studentName();
		s.studentId();
		s.studentAddress();
	}

}
