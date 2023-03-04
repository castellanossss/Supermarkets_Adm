package model;

import java.io.IOException;

import tools.FileManagerWriter;

public class CustomerManager {
	private Customer customer;
	private FileManagerWriter fm;
	
	public CustomerManager(String path, String name) throws IOException {
		fm = new FileManagerWriter(path, name);
	}
	
	public void createCustomer( String rut, String name,Address address) {
		customer = new Customer( name,  address,rut);
	}
	
	public void registerCustomer(Customer customer) throws IOException {
		fm.toWriter(customer.getRut()+ ";" +customer.getName() + ";" +customer.getAddress().toString()+";"+runNumber());
	}
	
	public String runNumber() {
		String concat="";
		for (int i = 0; i < customer.getPhone().size(); i++) {
			concat +=customer.getPhone().get(i)+",";
		}
		return concat.substring(0, concat.length()-1);
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void addPhone(String value) {
		customer.getPhone().add(value);
	}
	
}
