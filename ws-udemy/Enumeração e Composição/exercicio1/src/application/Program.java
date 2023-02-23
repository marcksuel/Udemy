package application;

import java.lang.invoke.StringConcatFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter department's name:");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		
		System.out.println("Level: ");
		String workerLevel=sc.nextLine();
		
		System.out.println("Base salary: ");
		Double baseSalary = sc.nextDouble();
		sc.nextLine();
		
		Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary,new Departament(departmentName));
		
		System.out.println("How many contacts to this worker? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i =1 ;i<=n;i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.println("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.println("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Duration (hours): ");
			int hours = sc.nextInt();
			sc.nextLine();
			
			HourContract contract = new HourContract(contractDate,valuePerHour,hours);
			worker.addContract(contract);
			
		}
		
		System.out.println("\nEnter monthg and year to calculate  income(MM/YYYY): ");
		String monthAndYear=sc.next();
		
		Integer month = Integer.parseInt(monthAndYear.substring(0, 2));
		Integer year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: "+ worker.getDepartment().getName());
		System.out.println("Income for "+ monthAndYear + ": " + String.format("%,2f", worker.income(year,month)));
		
		sc.close();
		
	}
}
