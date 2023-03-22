package ventanas;

import java.util.Random;

import algoritmos.Burbuja;
import algoritmos.Selection;

public class SelectionConsola {
	public static void main(String[] args) {

		int array[] = new int[10];
		Random ran = new Random(700);
		
		// fill array with numbers random
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(20);
		}
		// print array generate
		System.out.println("normal");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
		// Order array
		Selection.order(array);
		System.out.println();

		// print array order
		System.out.println("ordernado");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}
