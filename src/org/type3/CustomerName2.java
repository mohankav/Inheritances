package org.type3;

public class CustomerName2 extends ParentClass {
	

	public  void productName() {
		System.out.println("Product Name is Travel Bag");
	}
	
	public  void productPrice() {
		System.out.println("Product price is 4550");
	}

	public static void main(String[] args) {
		
		CustomerName2 c = new CustomerName2();
		
		c.shopName();
		c.shopPlace();
		c.productName();
		c.productPrice();
		
	}

}
