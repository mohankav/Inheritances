package org.type3;


public class ParentClass {
	
	public  void shopName() {
		System.out.println("Shop name is D mart");
	}
	
	public void shopPlace() {
		System.out.println("shop place is Hosur");
	}
	
	public static void main(String[] args) {
		
		ParentClass p = new ParentClass();
		
		p.shopName();
		p.shopPlace();
		
	}

}
