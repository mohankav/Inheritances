package org.Type2;

public class Grandchild extends ChildClass {
	

	public  void grandChildName() {
		System.out.println("Child  name is santhosh");
	}
	
	
	
	public static void main(String[] args) {
		
		Grandchild g = new Grandchild();
		
		g.fatherName();
		g.motherName();
		g.sonName();
		g.grandChildName();
				
	}

}
