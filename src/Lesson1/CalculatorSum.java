package Lesson1;

import java.util.Scanner;

public class CalculatorSum {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insert number a");
		int a = in.nextInt();
		
		System.out.println("Insert number b");
		int b = in.nextInt();
		
		
		int result = a + b;// sum of a and b
		System.out.println( " El resultado de la suma es " + result);
	}

}
