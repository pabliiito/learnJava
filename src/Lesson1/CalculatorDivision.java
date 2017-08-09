package Lesson1;

import java.util.Scanner;


public class CalculatorDivision {
	
	//build the same as in sum BUT: be careful with int, double, ... when dividing. 
	// 5 / 2 is not a int !!!!
	
	public static void main(String[] args) {
	//build the same Calculator as in sum only multiplicator now

		 
		
		Scanner in = new Scanner (System.in);
		System.out.print("Inserta el numero a");
		double a = in.nextInt();
		
		
		
		System.out.println("Ingrese el primer numero");
		double b = in.nextInt();
		

		double result = (a / b);//Multiplicacion de a por b
		System.out.println("El resultado es " + result);
	}
}