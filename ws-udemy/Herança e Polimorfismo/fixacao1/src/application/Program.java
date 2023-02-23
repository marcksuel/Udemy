package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);			
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		Integer n = sc.nextInt();
		sc.nextLine();
		
		
		for (int i =0;i<n;i++) {
			System.out.println("Is a imported product(1) or Used(2): ");
			Integer op = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Price $: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			
			
			if(op == 1) {
				System.out.println("Customs Fee $:");
				Double fee = sc.nextDouble();
				sc.nextLine();
				list.add(new ImportedProduct(name,price,fee));
				
			}else {
				System.out.println("Manufacture date (DD/MM/YYYY: ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name,price,date));
			}
			
		}
		System.out.println("Product's: ");
		Integer	i=0;
		for(Product c: list) {
			System.out.println("Product #"+(i+1)+"\n" + c.priceTag());
			i++;
		}
			
	sc.close();}

}
