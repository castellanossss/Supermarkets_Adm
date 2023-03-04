package model;

public class Person {
	
	private String name;
	private Address address;
	private String rut;
	
	public Person(String name, String rut, Address address) {
		this.name = name;
		this.address = address;
		this.rut = rut;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
}
