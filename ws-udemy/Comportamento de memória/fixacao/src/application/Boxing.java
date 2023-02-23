package application;

import java.util.function.LongToIntFunction;

public class Boxing {

	public static void main(String[] args) {
		String x = "Hola";
		
		Object obj = x;
		
		System.out.println(obj);
		
		char y = x.charAt(0);;
		obj = y;
		
		obj = y;	
		
		System.out.println(obj);
	}

}
