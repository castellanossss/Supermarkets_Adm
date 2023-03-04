package model;

import java.time.LocalDate;

public class Sale {
	private int id;
	private LocalDate date;
	private String customerName;
	private String discount;
	private String finalBill;
	
	public Sale(int id, LocalDate date, String customerName, String discount, String finalBill) {
		super();
		this.id = id;
		this.date = date;
		this.customerName = customerName;
		this.discount = discount;
		this.finalBill = finalBill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCustomer() {
		return customerName;
	}

	public void setCustomer(String customerName) {
		this.customerName = customerName;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getFinalBill() {
		return finalBill;
	}

	public void setFinalBill(String finalBill) {
		this.finalBill = finalBill;
	}

}
