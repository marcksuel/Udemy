package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		double price;
		int quantity;
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Price: ");
		price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		product.setName("Computer");
		System.out.println(product.getName());

		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantit = sc.nextInt();
		product.addProducts(quantit);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantit);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}