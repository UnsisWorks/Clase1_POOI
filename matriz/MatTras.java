
/**************************************
 * nombre: Eletzer Jared			  *
 * 	 Galicia Cordova 				  *
 * fecha de creacion: 20/03/2023	  * 
 * fecha de modificacion: 21/03/2023  *
 * descripcion: Creacion y uso de un  *
 * para generar la matriz transpuesta *
 *									  *
 ***************************************/

package matriz;

import java.util.Random;

public class MatTras {
	
	public static int[][] getTranspuesta(int array[][]) {
		int trans[][] = new int[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				trans[j][i] = array[i][j];
			}
		}
		return trans;
	}
	
	public static void main(String[] args) {
		int array[][] = new int[5][5];
		Random ran = new Random(500);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = ran.nextInt(10);
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		array = getTranspuesta(array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
