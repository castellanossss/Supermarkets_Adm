package model;

import java.io.IOException;
import tools.FileManagerWriter;

public class SuppliersManager {
	private Supplier supplier;
	private FileManagerWriter fm;

	public SuppliersManager(String path, String name) throws IOException {
		fm = new FileManagerWriter(path, name);
	}
	
	public void registerSupplier(Supplier supplier) throws IOException {
		fm.toWriter(supplier.getRut() + ";" + supplier.getName()+ ";" + supplier.getAddress() + ";" + supplier.getPhone() + ";" + supplier.getWebPage());
	}
	
	public void createSupplier(String rut, String name, Address address, String phone, String webPage) throws IOException {
		 supplier = new Supplier(rut, name, address, phone, webPage);
		 this.registerSupplier(supplier);
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
}
