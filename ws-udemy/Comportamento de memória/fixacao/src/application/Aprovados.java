package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Aluno[] vect = new Aluno[n];
		for(int i =0 ; i< vect.length ;i++) {
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Firt note: ");
				double first = sc.nextDouble();
				sc.nextLine();
				System.out.println("Second note: ");
				double second = sc.nextDouble();
				sc.nextLine();
				
				vect[i] = new Aluno(name,first,second);
								
		}
		System.out.println("Approved students: ");
		for(int i =0;i<vect.length;i++) {
			if(vect[i].aprovation()) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}

}
