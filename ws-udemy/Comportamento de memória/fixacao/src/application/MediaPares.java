package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		double average =0;
		boolean pair=false;
		for (int i=0;i<vect.length;i++) {
			System.out.println("Type a number: ");
			vect[i]=sc.nextDouble();
			sc.nextLine();
			if(vect[i]%2==0) {
				average+=vect[i];
				pair = true;
			}
		}
		if(pair){
			average = average/vect.length;
			System.out.println("pair average: "+String.format("%.2f", average));
		}else {
			System.out.println("none pair number");

		}
		sc.close();

	}

}
