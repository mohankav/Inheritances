package org.Type1;

public class ChildClass extends ParentClass {
	
	public void studentDegree() {
		System.out.println(" Student Degree is B.E Mechanical");
	}
	

	public void studentpercentage() {
		System.out.println(" Student Percentage is 65%");
	}
	

	public void studentDetails() {
		System.out.println("Student phone No is 80722671454");
	}
	
	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		
		c.studentName();
		c.studentId();
		c.studentAddress();
		c.studentDegree();
		c.studentDetails();
		c.studentpercentage();
	}

}
