package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] vect = new Pessoa[n];
		int sixteen=0;
		double sum=0;
		for(int i = 0 ; i<vect.length;i++) {
			
			System.out.println("Peaple #"+(i+1) + "\nName: ");
			String name= sc.nextLine();
			System.out.println("Age: ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Height: ");
			double height = sc.nextDouble();
			sc.nextLine();

			sum+= height;
			vect[i]= new Pessoa(name,age,height);
			
			if(vect[i].getAge() <16) {
				sixteen++;
			}
			
			
		}
		
		System.out.println("Average Height: " + sum/vect.length);
		double percent = (sixteen/vect.length)*100;
		
		System.out.println("percentage of people under 16: " + String.format("%.2f", percent)+"%");

		for(int i = 0 ; i<vect.length;i++) {
			if(vect[i].getAge() <16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
