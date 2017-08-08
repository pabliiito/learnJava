package Lesson1;

import java.util.Scanner;

public class CalculaterMultiplication {
	
	public static void main(String[] args) {
	//build the same Calculator as in sum only multiplicator now

		
		Scanner in = new Scanner (System.in);
		System.out.println("Inserta el numero a");
		int a = in.nextInt();
		
		System.out.println("Inserta el numero b");
		int b = in.nextInt();
		
		int result = a * b;//Multiplicacion de a por b
		System.out.println("El resultado es " + result);
	}
}
