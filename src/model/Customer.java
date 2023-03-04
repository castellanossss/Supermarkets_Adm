package model;

import java.util.ArrayList;

public class Customer extends Person{
	ArrayList <String> phone;
	public Customer(String name, Address address, String rut) {
		super(rut, name, address);
		phone = new ArrayList<String>();
	}
	public void addPhone(String value) {
		
	
	}
	public ArrayList<String> getPhone() {
		return phone;
	}
	public void setPhone(ArrayList<String> phone) {
		this.phone = phone;
	}
}
