package application;

import java.util.Locale;
import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int[n];
		
		for(int i =0; i< vect.length;i++) {
			System.out.println("Type a number: ");
			vect[i]= sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Pair Numbers: ");
		int cont=0;
		for(int i =0; i< vect.length;i++) {
			if(vect[i]%2==0) {
				System.out.print(vect[i] + " ");
				cont++;
			}
			
		}
		
		System.out.println("Numbers of pair: " + cont);

		
		sc.close();
	}

}
