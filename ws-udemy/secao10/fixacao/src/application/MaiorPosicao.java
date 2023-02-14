package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int[n];
		int throne=0;
		int position=0;
		for(int i =0; i< vect.length;i++) {
			System.out.println("Type a number: ");
			vect[i]= sc.nextInt();
			sc.nextLine();
			if(i==0) {
				throne=vect[i];
				position =i;
			}else if(vect[i]>throne) {
				throne=vect[i];
				position =i;
			}
		}
		System.out.println("Highest value: " + throne );
		System.out.println("Position of Highest value: " + position );

		sc.close();
	}

}
