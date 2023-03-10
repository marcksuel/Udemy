package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class DadosPessoais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Dados[] vect = new Dados[n];
		double higher=0;
		double lower=0;
		int man=0, woman=0;
		double avgWoman=0;
		for(int i =0 ;i<vect.length;i++) {
			System.out.println("Height " + (i+1)+ "º person: ");
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.println("Gender " + (i+1)+ "º person: ");
			char gender = sc.next().charAt(0);
			vect[i] = new Dados(height, gender);
			if(higher<vect[i].getHeight()) {
				higher = vect[i].getHeight();
			}else if(lower >vect[i].getHeight()) {
				lower = vect[i].getHeight();
			}
			String g = "" + gender;
			if(g.equals("M")) {
				man++;
			}else if(g.equals("F")) {
				avgWoman+= vect[i].getHeight();
				woman++;
			}
		}
		System.out.println("Lower Height: " + lower);
		System.out.println("Higher height: " + higher);


		avgWoman /= woman;
		System.out.println("Women's high average: " + String.format("%.2f", avgWoman));

		System.out.println("Number of men: " + man);
		
		sc.close();
	}

}
