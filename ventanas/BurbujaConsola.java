/**************************************
 * nombre: Eletzer Jared			  *
 * 	 Galicia Cordova 				  *
 * fecha de creacion: 20/03/2023	  * 
 * fecha de modificacion: 21/03/2023  *
 * descripcion: Implementacion de 	  *
 * 	algoritmo de ordenacion burbuja   *
 *	en terminal de comandos			  *
 **************************************/

package ventanas;

import java.util.Random;

import algoritmos.Burbuja;

public class BurbujaConsola {
	
	public static void main(String[] args) {

		int array[] = new int[10];
		Random ran = new Random(600);
		
//		Lenado
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(20);
		}
//		normal
		System.out.println("normal");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		array = Burbuja.orderArray(array);
		System.out.println();

//		ordenado
		System.out.println("ordernado");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}
