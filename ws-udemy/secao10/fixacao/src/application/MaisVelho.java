package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] vect = new Pessoa[n];
		String throne_name="";
		int throne_age=0;
		for(int i =0; i< vect.length;i++) {
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Age: ");
			int age = sc.nextInt();
			sc.nextLine();
			
			vect[i]=new Pessoa(name,age);
			
			if(i==0) {
				throne_age=vect[i].getAge();
				throne_name= vect[i].getName();
			}else if(vect[i].getAge()>throne_age) {
				throne_age=vect[i].getAge();
				throne_name= vect[i].getName();
			}
		}
		
		System.out.println("Older person: " + throne_name);

		sc.close();
	}

}
