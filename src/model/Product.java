package model;

public class Product {
	private int id;
	private String name;
	private float price;
	private int stock;
	private String supplier;
	private Category category;
	
	public Product(int id, String name, float price, int stock, String supplier, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.supplier = supplier;
		this.category = category;
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
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getSupplier() {
		return supplier;
	}
	
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
