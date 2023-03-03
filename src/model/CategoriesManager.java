package model;

import java.io.IOException;
import java.util.ArrayList;

import tools.FileManagerReader;
import tools.FileManagerWriter;

public class CategoriesManager {
	private Category category;
	ArrayList<Category>categoryList;
	private FileManagerReader fr;
	
	public CategoriesManager(String path, String name) throws IOException {
		fr = new FileManagerReader(path, name);
		categoryList = new ArrayList();
	}
	
	public void readCategories() throws IOException {
		String[]arreglo;
		fr.readFile();
		for (int i = 0; i < fr.getLines().size(); i++) {
			arreglo = fr.getLines().get(i).split(";");
			this.createCategory(Integer.parseInt(arreglo[0]),arreglo[1],arreglo[2]);
		}
	}
	public void createCategory(int id,String name ,String description) throws IOException {
		categoryList.add(new Category(id, name, description));
	}
	/*public void recorrer() {
		for (int i = 0; i < categoryList.size(); i++) {
			System.out.println(categoryList.get(i).getName());
		}
	}
	public static void main(String[] args) throws IOException {
		CategoriesManager ct = new CategoriesManager("Files\\","categories");
		ct.readCategories();
		ct.recorrer();
	}*/
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public ArrayList<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(ArrayList<Category> categoryList) {
		this.categoryList = categoryList;
	}
}
