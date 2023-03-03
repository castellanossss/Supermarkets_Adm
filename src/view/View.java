package view;

import javax.swing.JOptionPane;

public class View {
		
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
		
	public String readData(String message) {
		String data = JOptionPane.showInputDialog(null, message);
		return data;
	}
		
	public void welcomeMessage() {
		showMessage("¡BIENVENIDO AL SISTEMA DE ADMINISTRACION DE ALMACENES DE CADENA!");
	}
		
	public void alertMessage() {
		JOptionPane.showMessageDialog(null, "Por favor, ingresa una opcion valida" , "¡ERROR!", JOptionPane.ERROR_MESSAGE);
	}
	
	public void confirmationMessage() {
		showMessage("¡Proceso realizado exitosamente!");
	}
	
	public void displayArchiveInfo() {
		JOptionPane.showMessageDialog(null, "Para verificar que todo esta bien, dirigete a la carpeta Files y refresca/actualiza.\nYa deberían aparecer los cambios en los archivos .txt respectivos. \nPara volver a la ventana actual presiona Crtl + Alt + Tab y selecciona la ventana :D" , "¡IMPORTANTE!", JOptionPane.WARNING_MESSAGE);
	}
		
	public void goodbyeMessage() {
		showMessage("¡Programa finalizado, que tengas un excelente dia!");
	}
		
	public int firstMenu() {
		int option = Integer.parseInt(readData("~~~~~~~~~~~\n                   Bienvenido Usuario\n~~~~~~~~~~~\n"
				+ " ¿Que deseas hacer?\n"
				+ " 1. Pasar al menu administrativo \n 2. Salir \n~~~~~~~~~~~~\n Digita una opcion"));
		return option;
	}
		
	public int secondMenu() {
		int option = Integer.parseInt(readData("~~~~~~~~~~~\n                 Opciones Disponibles\n~~~~~~~~~~~\n"
				+ " 1. Crear Proveedor \n 2. Crear Cliente \n 3. Crear Producto \n 4. Registrar Venta \n 5. Ver las Ventas Totales \n 6. Salir\n"
				+ "~~~~~~~~~~~~\n Digita una opcion"));
		return option;
	}
		
	public String askForSupRut() {
		String rut = readData("Ingresa el RUT del Proveedor");
		return rut;
	}
		
	public String askForSupName() {
		String name = readData("Ingresa el Nombre Completo del Proveedor");
		return name;
	}
		
	public void addressSupInfoMessage() {
		showMessage("A continuacion, ingresaras el pais, estado, ciudad, barrio y direccion del proveedor");
	}
		
	public String askForSupCountry() {
		String country = readData("Ingresa el Pais donde se ubica el Proveedor");
		return country;
	}
		
	public String askForSupState() {
		String state = readData("Ingresa el Estado donde se ubica el Proveedor");
		return state;
	}
		
	public String askForSupCity() {
		String city = readData("Ingresa la Ciudad donde se ubica el Proveedor");
		return city;
	}
		
	public String askForSupNeighbordhood() {
		String neighbordhood = readData("Ingresa el Barrio donde se ubica el Proveedor");
		return neighbordhood;
	}
		
	public String askForSupAddress() {
		String address = readData("Ingresa la Direccion donde se ubica el Proveedor");
		return address;
	}
		
	public String askForSupPhoneNumber() {
		String phoneNumber = readData("Ingresa el Numero Telefonico del Proveedor");
		return phoneNumber;
	}
		
	public String askForSupWebPage() {
		String webPage = readData("Ingresa la Pagina Web del Proveedor");
		return webPage;
	}
		
	public String askForCustomerName() {
		String CustomerName = readData("Ingresa el nombre del cliente:");
		return CustomerName;
	}
		
	public String askForCustomerCountry() {
		String city = readData("Ingresa el pais donde se ubica el cliente:");
		return city;
	}
		
	public String askForCustomerState() {
		String state = readData("Ingresa el Estado donde se ubica el cliente:");
		return state;
	}
		
	public String askForCustomerCity() {
		String city = readData("Ingresa la ciudad donde se ubica el cliente:");
		return city;
	}
		
	public String askForCustomerNeighbordhood() {
		String neighbordhood = readData("Ingresa el Barrio donde se ubica el cliente:");
		return neighbordhood;
	}
		
	public String askForCustomerRut() {
		String rut = readData("Ingresa el RUT del cliente");
		return rut;
	}
		
	public String askForCusRut() {
		String rut = readData("Ingresa el RUT del Cliente");
		return rut;
	}
		
	public String askForCusName() {
		String name = readData("Ingresa el Nombre Completo del Cliente");
		return name;
	}
		
	public void addressCusInfoMessage() {
		showMessage("A continuacion, ingresaras el pais, estado, ciudad, barrio y direccion del cliente");
	}
		
	public String askForCusCountry() {
		String country = readData("Ingresa el Pais donde se ubica el Cliente");
		return country;
	}
		
	public String askForCusState() {
		String state = readData("Ingresa el Estado donde se ubica el Cliente");
		return state;
	}
		
	public String askForCusCity() {
		String city = readData("Ingresa la Ciudad donde se ubica el Cliente");
		return city;
	}
		
	public String askForCusNeighbordhood() {
		String neighbordhood = readData("Ingresa el Barrio donde se ubica el Cliente");
		return neighbordhood;
	}
		
	public String askForCusAddress() {
		String address = readData("Ingresa la Direccion donde se ubica el Cliente");
		return address;
	}
		
	public int askForPhoneNumberAmount() {
		int amount = Integer.parseInt(readData("¿Cuantos numeros de celular del cliente quieres registrar?"));
		return amount;
	}
		
	public String askForCusPhoneNumber(int num) {
		String phoneNumber = readData("Ingresa el Numero de Celular numero " + num + " de Cliente");
		return phoneNumber;
	}
		
	public int askForProId() {
		int id = Integer.parseInt(readData("Ingresa el id del Producto"));
		return id;
	}
		
	public String askForProName() {
		String name = readData("Ingresa el Nombre del Producto");
		return name;
	}
		
	public float askForProActualPrice() {
		float actualPrice = Float.parseFloat(readData("Ingresa el Precio Actual del Producto"));
		return actualPrice;
	}
		
	public int askForProStock() {
		int stock = Integer.parseInt(readData("Ingresa la Cantidad de Unidades Disponibles del Producto"));
		return stock;
	}
		
	public String askForProSupplier() {
		String supplier = readData("Ingresa el Nombre del Proveedor del Producto");
		return supplier;
	}
		
	public void proCategoryInfo() {
		showMessage("A continuacion, proporcionaras los datos de la categoria a la cual pertenece el producto");
	}
		
	public int askForCatId() {
		int id = Integer.parseInt(readData("Ingresa el id de la Categoria del Producto"));
		return id;
	}
		
	public String askForCatName() {
		String category = readData("Ingresa el Nombre de la Categoria del Producto");
		return category;
	}
		
	public String askForCatDescription() {
		String description = readData("Ingresa una Breve Descripcion sobre la Categoria del Producto");
		return description;
	}
		
	public int askForSaleId() {
		int id = Integer.parseInt(readData("Ingresa el id de la Venta"));
		return id;
	}
		
	public void salesDateInfo() {
		showMessage("A continuacion, vas a ingresar el año, mes y dia en el cual se efectuo la venta");
	}
		
	public int askForSaleYear() {
		int year = Integer.parseInt(readData("Ingresa el Año en el Cual se Efectuo la Venta"));
		return year;
	}
		
	public int askForSaleMonth() {
		int month = Integer.parseInt(readData("Ingresa el Mes en el Cual se Efectuo la Venta (en numero)"));
		return month;
	}
		
	public int askForSaleDay() {
		int day = Integer.parseInt(readData("Ingresa el Dia en el Cual se Efectuo la Venta"));
		return day;
	}
		
	public String askForSaleCustomer() {
		String customer = readData("Ingresa el Nombre del Cliente al Cual se le Realizo la Venta");
		return customer;
	}
	
	public long askForSaleDiscount() {
		long discount = Long.parseLong(readData("Ingresa el valor del descuento realizado"));
		return discount;
	}
		
	public float askForSaleFinalBill() {
		float finalBill = Float.parseFloat(readData("Ingresa el Valor Final de la Venta"));
		return finalBill;
	}
		
	public int thirdMenu() {
		int option = Integer.parseInt(readData("~~~~~~~~~~~\n          Proceso realizado con exito\n~~~~~~~~~~~\n"
				+ " ¿Que deseas hacer a continuacion? \n 1. Volver al menu principal \n 2. Salir\n~~~~~~~~~~~~\n"
				+ " Digita una opcion"));
		return option;
	}
		

}