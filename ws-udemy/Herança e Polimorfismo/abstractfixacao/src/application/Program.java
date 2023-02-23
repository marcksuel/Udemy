package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		List<Pessoa> list = new ArrayList<>();
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of tax payers: ");
		Integer n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1 ;i <=n;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual(i) or company(c): ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Anual Income: ");
			Double anualIncome = sc.nextDouble();
			sc.nextLine();
			
			if(option == 'i' || option =='I') {
				System.out.println("Health expenditure: ");
				Double healthExpenditure = sc.nextDouble();
				sc.nextLine();
				
				list.add(new Fisica(name,anualIncome,healthExpenditure));
				
			}else if(option == 'c' || option =='C') {
				System.out.println("Number of Employee: ");
				Integer numberOfEmployee = sc.nextInt();
				sc.nextLine();
				
				list.add(new Juridica(name,anualIncome,numberOfEmployee));
				
			}else {
				System.out.println("opção invalida");
				i--;
			}
		}
		System.out.println("TAXES PAID:");
		double sum=0;
		for(Pessoa c: list) {
			System.out.println(c);
			sum+= c.tax();
		}
		
		System.out.println("TOTAL TAX: $ "+ String.format("%.2f", sum));
		
	sc.close();}
}
