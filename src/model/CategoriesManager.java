package model;

import java.io.IOException;
import tools.FileManagerWriter;

public class CategoriesManager {
	private Category category;
	private FileManagerWriter fm;
	
	public CategoriesManager(String path, String name) throws IOException {
		fm = new FileManagerWriter(path, name);
	}
	
	public void registerCategory(Category category) throws IOException {
		fm.toWriter(category.getId() + ";" + category.getName() + ";" + category.getDescription());
	}
	
	public void createCategory(int id, String name, String description) throws IOException {
		category = new Category(id, name, description);
		this.registerCategory(category);
	}
}
