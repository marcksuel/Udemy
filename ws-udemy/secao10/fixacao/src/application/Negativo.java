package application;

import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
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
		for(int i =0; i< vect.length;i++) {
			if(vect[i]<0) 
			System.out.println(vect[i]);
		}
		
		sc.close();		
		
	}

}
