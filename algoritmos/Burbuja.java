
/**************************************
 * nombre: Eletzer Jared			  *
 * 	 Galicia Cordova 				  *
 * fecha de creacion: 20/03/2023	  * 
 * fecha de modificacion: 21/03/2023  *
 * descripcion: Creacion del algoritmo*
 *  de ordenacion Burbuja 		  *
 *									  *
 ***************************************/

package algoritmos;

public class Burbuja {
	
	public static int[] orderArray(int[] array) {
		int aux;
		int band = 0;
		
		// number iterations
		while(band != array.length) {
			band = 1;
			// Order elements
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
				} else {
					band++;
				}
			}
		}
		return array;
	}
}
