package com.csi.jdkfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	private int productId;
	
	private String productName;
	
	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
}
public class SttreamAPIConcept {
	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(101, "MI SMART TV", 56000.00));
		productList.add(new Product(102, "MI SMART Phone", 544.00));
		productList.add(new Product(104, "LENOVO LAPTOP", 545.00));
		productList.add(new Product(109, "APPLE PHONE", 4545.00));
		productList.add(new Product(111, "ASUS LAPTOP", 45000.00));
		productList.add(new Product(123, "SAMSUNG SMART TV", 25000.00));
		productList.add(new Product(191, "HP LAPTOP", 21000.00));
		productList.add(new Product(198, "ACER LAPTOP", 456567.00));
		//System.out.println("\n List of Items: "+ productList.size());
		productList.stream().filter(product->product.getProductName().equals("APPLE PHONE")).forEach(p->System.out.println(p));
	
		long productCount = productList.stream().collect(Collectors.counting());
	
		System.out.println("\n List of Items: "+ productCount);
	}
}



