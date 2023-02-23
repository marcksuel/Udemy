package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.println("Enter Client data:"
				+ "\nName: ");
		String name = sc.nextLine();
		
		System.out.println("Email: ");
		String email = sc.nextLine();
		
		System.out.println("Birtg date (DD/MM/YYYY: ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name,email,birthDate);
		
		System.out.println("Enter order data:"
				+ "\nStatus: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.println("How many items to this order? ");
		Integer n = sc.nextInt();
		sc.nextLine();
		Order order = new Order(new Date(),status,client);
		
		for(int i =0;i<n;i++) {
			System.out.println("Enter #"+ i + " Item data: "+
					"Product name: ");
			String productName =sc.nextLine();
			
			System.out.println("Product price $: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			
			Product product = new Product(productName,price);
			OrderItem item = new OrderItem(quantity,price,product);
			
			order.addItem(item);
		}
		System.out.println("\n\n" + order);
		
	}
}
