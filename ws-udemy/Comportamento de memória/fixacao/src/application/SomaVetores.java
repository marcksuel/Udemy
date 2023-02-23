package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Size: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vectA = new double[n];
		System.out.println("A: ");

		for (int i=0;i<vectA.length;i++) {
			vectA[i]=sc.nextDouble();
			sc.nextLine();
		}
		System.out.println("B: ");
		double[] vectB = new double[n];

		for (int i=0;i<vectB.length;i++) {
			vectB[i]=sc.nextDouble();
			sc.nextLine();
		}
		
		double[] vectC = new double[n];
		
		System.out.println("C: ");

		for (int i=0;i<vectB.length;i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);

		}
		
		sc.close();
	}

}
