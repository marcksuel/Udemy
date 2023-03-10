package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class Program {
	static List <Emplyoee> emplyoee = new ArrayList<>(); // inicialização da lista vazia
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		Integer option;
		
		do {
			System.out.println("\n1- Adicionar funcionario"
					+ "\n2- Aumento"
					+ "\n3- Listar funcionarios"
					+ "\n4- sair");
			option	= sc.nextInt();
			sc.nextLine();
			
			switch (option) {
			case 1: {
				add();
				break;
			}
			case 2: {
				increase();
				break;
			}
			case 3: {
				apresentation();
				break;
			}
			case 4: {
				System.out.println("See you later!");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
			
		}while(option !=4);
		sc.close();

	}// fim main
	
	public static void add() {
		System.out.println("ID: ");
		Integer id= sc.nextInt();
		sc.nextLine();
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Salary: ");
		Double salary= sc.nextDouble();
		sc.nextLine();
		
		Boolean validation=true;
		for (Emplyoee x : emplyoee) {
			if(x.getId()== id) {
				validation = false;
			}
		}
		
		if(validation) {
			emplyoee.add(new Emplyoee(id,name,salary));
		}else {
			System.out.println("This ID is already in use");
		}
	}
	public static void increase() {
		System.out.println("Enter the emplyoee ID that will have salary increase: ");
		Integer id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the porcentage: ");
		Double percentage = sc.nextDouble()/100;
		for (Emplyoee x : emplyoee) {

			if(x.getId()== id) {
				x.increase(percentage);
				break;
			}
			if(emplyoee.indexOf(x)+1 == emplyoee.size()) {
				System.out.println("This ID doesn't exist");
			}
		}
	}
	public static void apresentation() {
		Integer i=1;
		for(Emplyoee x: emplyoee) {
			System.out.println("Emplyoee #"+ i + x.toString());
		}
	}

}//fim Program

