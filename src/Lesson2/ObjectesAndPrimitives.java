package Lesson2;

import java.util.ArrayList;

import com.sun.corba.se.spi.ior.MakeImmutable;
import com.sun.javafx.image.impl.IntArgb;

public class ObjectesAndPrimitives {
	
	public static void main(String[] args) {
		
		// Entender la diferencia entre OBJECTS y PRIMITIVES 
		// Leer en internet: google: diferencia OBJECTS y PRIMITIVES JAVA
		
		// Esta un primitiv 
		int num1 = 10;
		System.out.println("firstNum " + num1);
		int secondNum = num1;
		System.out.println("secondNum " + secondNum);
		secondNum = 90;
		System.out.println("secondNum After " + secondNum);
		System.out.println("firstNum After " + num1);
		
		System.out.println("\n ---------------- \n");
		
		// Esta un ArrayList 
		// Leer en internet: google: ArrayList Java
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		firstList.add(10);
		firstList.add(9);
		firstList.add(8);
		System.out.println("firstList " + firstList);
		ArrayList<Integer> secondList = firstList;
		System.out.println("secondList " + secondList);
		secondList.add(7);
		System.out.println("secondList After " + secondList);
		System.out.println("firstList After " + firstList); // Porque firstList == [1, 2, 3, 4] ???
		
		System.out.println("\n ---------------- \n");
		
		// Esta un loop 
		// Leer en internet: google: for-loop y while-loop
		
		ArrayList<String> list = new ArrayList<String>();
		
//        StringBuilder sb = new StringBuilder();
//        sb.append("");
//        for(int i=1;i<=8;i++){
//        	sb.append(i);
//        	list.add(Integer.valueOf(sb.toString()));
//         }
        
        String string = "";
        
        for(int i=1;i<=8;i++){
        	string = string + Integer.toString(i);
        	list.add(string);
         }
        
		    
		
		System.out.println("list" + list); //[5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
		
		// TAREA
		// 1) make a list like: [0,2,4,6,8,10,12,14,16,18] with a loop
		// 2) make a list like: [0,1,4,9,16,25,36,49,64,81] with a loop
		// 3) make a list like: [0,1,3,6,10,15,21,28,36,45] with a loop
		// 4) make a list like: [10,9,8,7,6,5,4,3,2,1] with a loop
		// 5) make a list like: [1,12,123,1234,12345,123456,1234567,12345678] with a loop
	}
}
	



	
	




