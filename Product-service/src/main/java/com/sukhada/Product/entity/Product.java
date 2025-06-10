package com.sukhada.Product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long prodId;
	
	
	private String prodName;
	
	private String category;
	
	private int quantity;
	
	private double price;

	public long getProdId() {
		return prodId;
	}

	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(long prodId, String prodName, String category, int quantity, double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", category=" + category + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	
	
	
	
	
}
