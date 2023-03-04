package model;

import java.io.IOException;
import java.time.LocalDate;

import tools.FileManagerWriter;

public class SalesManager {
	private Sale sale;
	private FileManagerWriter fm;
	
	public SalesManager(String path, String name) throws IOException {
		fm = new FileManagerWriter(path, name);
	}
	
	public void registerSale(Sale sale) throws IOException {
		fm.toWriter(sale.getId() + ";" + sale.getDate() + ";" + sale.getCustomer() + ";" + sale.getDiscount() +
				";" + sale.getFinalBill());
	}
	
	public void createSale(int id, LocalDate date, String customer, String discount, String finalBill) throws IOException {
		sale = new Sale(id, date, customer, discount, finalBill);
		this.registerSale(sale);
	}
	
	
	
	
	
	
	
}
