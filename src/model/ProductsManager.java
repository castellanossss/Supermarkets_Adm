package model;

import java.io.IOException;
import tools.FileManagerWriter;

public class ProductsManager {
	private Product product;
	private FileManagerWriter fm;
	private CategoriesManager categories;
	
	public ProductsManager(String path, String name) throws IOException {
		fm = new FileManagerWriter(path, name);
	}
	
	public void registerProduct(Product product) throws IOException {
		fm.toWriter(product.getId() + ";" + product.getName() + ";" + product.getPrice() + ";" + 
				product.getStock() + ";" + product.getSupplier() + ";" + product.getCategory().getName());
	}
	
	public void createProduct(int id, String name, float price, int stock, String supplier, CategoriesManager categories) throws IOException {
		product = new Product(id, name, price, stock, supplier,this.foundCategory(id, categories));
		this.registerProduct(product);
	}
	public Category foundCategory(int id,CategoriesManager categories) throws IOException {
		categories.readCategories();
		int i = 0;
		boolean bandera=true;
		int j =0;
		while (bandera) {
			
			if(categories.getCategoryList().get(i).getId()==id) {
				bandera = false;
				j=i;
			}
			i++;
		}
		return categories.getCategoryList().get(j);
	}
}
