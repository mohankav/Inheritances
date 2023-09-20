package org.Type2;

public class ChildClass extends parentclass {
	
	

	public  void sonName() {
		System.out.println("Son name is karthik");
	}
	
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		
		c.fatherName();
		c.motherName();
		c.sonName();
		
	}

}
