package Fixation;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Account acc;
		String name;
		int number;
		
		System.out.println("numero da conta: ");
		number = sc.nextInt();
		sc.nextLine();
		System.out.println("Nome do titular: ");
		name = sc.nextLine();
		
		System.out.println("Deseja realizar deposito inicial? (Y/N) ");
		if(sc.next().equals("y")) {
			
			double deposit;
			System.out.println("Valor do Deposito $: ");
			deposit = sc.nextDouble();
			sc.nextLine();
			
			acc = new Account(number,name,deposit);
			System.out.println(acc);
			
						
		}else {
			acc = new Account(number,name);
			System.out.println(acc);

		}
		
		int option=0;
		do {
			System.out.println("1- Deposit \n2- Withdraw \n3- Alteration username \n0- Exit ");
			option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
			case 0: {
				System.out.println("See you later!");
				break;
			}
			case 1: {
				System.out.println("Enter deposit value:");
				acc.deposit(sc.nextDouble());
				System.out.println(acc);
				break;
			}
			case 2: {
				System.out.println("Enter withdraw value:");
				acc.withdraw(sc.nextDouble());
				System.out.println(acc);
				break;
			}
			case 3: {
				System.out.println("Enter with new username:");
				acc.setUser(sc.nextLine());
				System.out.println(acc);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
		}while(option !=0);
		
		
		sc.close();
		
	}

}
