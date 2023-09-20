package org.type3;

public class CustomerName1 extends ParentClass {
	
	public  void productName() {
		System.out.println("Product Name is Axe Signature");
	}
	
	public  void productPrice() {
		System.out.println("Product price is 450");
	}

	public static void main(String[] args) {
		
		CustomerName1 c = new CustomerName1();
		
		c.shopName();
		c.shopPlace();
		c.productName();
		c.productPrice();
		
	}
}
