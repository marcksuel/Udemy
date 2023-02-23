package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numer of employee: ");
		Integer n = sc.nextInt();
		sc.nextLine();
		
		List<Employee> employee = new ArrayList<>();
		
		for(int i =00;i<n;i++) {
			System.out.println("Employee #"+(i+1)+" data:");
			System.out.println("Outsourced (Y/N): ");
			char outsourced = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Hours: ");
			Integer hours = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Value per Hour: ");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();
			
			if (outsourced=='y' || outsourced =='Y') {
				System.out.println("Addicional Charge: ");
				Double addicionalCharge = sc.nextDouble();
				sc.nextLine();
				
				employee.add(new OutsourceEmployee(name,hours,valuePerHour,addicionalCharge));
			}else {
				employee.add(new Employee(name,hours,valuePerHour));
			}
			
		}
		System.out.println("\n");
		for(Employee x : employee) {
			System.out.println(x.getName() +": $"+ String.format("%.2f",x.payment()));
		}
		
		
	sc.close();}
}
