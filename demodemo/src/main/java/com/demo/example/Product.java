package com.demo.example;

public class Product {
	private int id;
	private String name;
	private float price;
	public Product(int id) {
		super();
		this.id = id;
	}
	public Product(String name) {
		super();
		this.name = name;
	}
	public Product(float price) {
		super();
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public void data() {
		System.out.println("Product [id=" + id + ", name=" + name + ", price=" + price + "]");
	}

}
