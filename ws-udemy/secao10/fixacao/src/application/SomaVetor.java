package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		
		for(int i =0; i< vect.length;i++) {
			System.out.println("Type a number: ");
			vect[i]= sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Valors: ");
		double soma=0;
		for(int i =0 ;i<vect.length;i++) {
			System.out.print(vect[i] + " ");
			soma+=vect[i];
		}
		System.out.println("Sum: " + soma);
		System.out.println("Average: " + soma/vect.length);
		
		sc.close();
		
	}

}
