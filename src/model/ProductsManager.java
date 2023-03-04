package model;

import java.io.IOException;
import tools.FileManagerWriter;

public class ProductsManager {
	private Product product;
	private FileManagerWriter fm;
	
	public ProductsManager(String path, String name) throws IOException {
		fm = new FileManagerWriter(path, name);
	}
	
	public void registerProduct(Product product) throws IOException {
		fm.toWriter(product.getId() + ";" + product.getName() + ";" + product.getPrice() + ";" + 
				product.getStock() + ";" + product.getSupplier() + ";" + product.getCategory());
	}
	
	public void createProduct(int id, String name, float price, int stock, String supplier, Category category) throws IOException {
		product = new Product(id, name, price, stock, supplier, category);
		this.registerProduct(product);
	}
	
}
