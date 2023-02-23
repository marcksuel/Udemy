package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		double average =0;
		for (int i=0;i<vect.length;i++) {
			System.out.println("Type a number: ");
			vect[i]=sc.nextDouble();
			sc.nextLine();
			average+=vect[i];
		}
		average = average/vect.length;
		System.out.println("average: "+String.format("%.2f", average));

		System.out.println("Elements below average ");
		for (int i=0;i<vect.length;i++) {
			if(vect[i]<average) {
				System.out.println(vect[i]);
				
			}
		}
		
		sc.close();
	}

}
