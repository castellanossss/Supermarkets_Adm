package presenter;

import java.text.NumberFormat;
import java.time.LocalDate;

import model.Address;
import model.CategoriesManager;
import model.CustomerManager;
import model.ProductsManager;
import model.SalesManager;
import model.SuppliersManager;
import tools.FileManagerReader2;
import view.View;

public class Presenter {
	private View view;
	
	public Presenter() {
		view = new View();
	}
	
	public void newSupplierOption() {
		supplier = new SuppliersManager("Files\\", "suppliers");
		supplier.createSupplier(view.askForSupRut(), view.askForSupName(), 
				new Address(view.askForSupCountry(), view.askForSupState(), view.askForSupCity(), view.askForSupNeighbordhood(), view.askForSupAddress()), 
				view.askForSupPhoneNumber(), view.askForSupWebPage());
		view.displayArchiveInfo();
	}
	
	public void newCustomerOption() {
		customer = new CustomerManager("Files\\", "customers");
		customer.createCustomer(view.askForCustomerRut(), view.askForCustomerName(),
				new Address(view.askForCustomerCountry(), view.askForCustomerState(), view.askForCustomerCity(), view.askForCustomerNeighbordhood(), view.askForCusAddress()));
		
		int j = view.askForPhoneNumberAmount();
		for (int i = 1; i <= j; i++) {
			customer.addPhone(view.askForCusPhoneNumber(i));
		}
		customer.registerCustomer(customer.getCustomer());
		view.displayArchiveInfo();
	}
	
	public void newProductOption() {
		categories = new CategoriesManager("Files\\","categories");
		product = new ProductsManager("Files\\","products");
		categories.readCategories();
		product.createProduct(12, "brayan", 12, 3, "camilo", categories);
		view.displayArchiveInfo();
	}
	
	public LocalDate generate_bill_date() {
		int sale_day = view.askForSaleDay();
		int sale_month = view.askForSaleMonth();
		int sale_year = view.askForSaleYear();
		
		LocalDate date = LocalDate.of(sale_year, sale_month, sale_day);
		return date;
	}
	
	public void recordSaleOption() {
		int id = view.askForSaleId();
		view.salesDateInfo();
		LocalDate date = generate_bill_date();
		String customerName = view.askForSaleCustomer();
		long disc = view.askForSaleDiscount();
		float fp = view.askForSaleFinalBill();
		
		NumberFormat format = NumberFormat.getCurrencyInstance();
		String discount = format.format(disc);
		String finalPrice = format.format(fp);
		
		sale = new SalesManager("Files\\", "bills");
		sale.createSale(id, date, customerName, discount, finalPrice);
		view.displayArchiveInfo();
	}
	
	public void showAllSalesOption() {
		String path = "Files\\bills.txt";
		test = new FileManagerReader2(path);
		String result = test.readFile();
		
		view.showMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n VENTAS REGISTRADAS\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+ " La informacion esta organizada de la siguiente forma\n"
				+ " id  ~  Fecha  ~  Nombre del Proveedor  ~  Valor del Descuento  ~  Valor Final\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" 
				+ result);
		view.displayArchiveInfo();
	}
	
	
	private void firstDecision() {
		int option = view.firstMenu();
		
		switch (option) {
			case 1:
				secondDecision();
			case 2:
				view.goodbyeMessage();
				System.exit(0);
				break;
			default:
				view.alertMessage();
				firstDecision();
		}
	}
	
	private void secondDecision() {
		int option = view.secondMenu();
		
		switch (option) {
			case 1:
				newSupplierOption();
				thirdDecision();
			case 2:
				newCustomerOption();
				thirdDecision();
			case 3:
				newProductOption();
				thirdDecision();
			case 4:
				recordSaleOption();
				thirdDecision();
			case 5:
				showAllSalesOption();
				thirdDecision();
			case 6:
				view.goodbyeMessage();
				System.exit(0);
				break;
			default:
				view.alertMessage();
				secondDecision();
		}
	}
	
	private void thirdDecision() {
		int option = view.thirdMenu();
		
		switch (option) {
			case 1:
				secondDecision();
			case 2:
				view.goodbyeMessage();
				System.exit(0);
				break;
			default:
				view.alertMessage();
				thirdDecision();
		}
	}
	
	private void run() {
		view.welcomeMessage();
		firstDecision();
	}
	

	public static void main(String[] args) {
		Presenter main = new Presenter();
		main.run();
	}

}
