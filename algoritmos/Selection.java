/**************************************
 * nombre: Eletzer Jared			  *
 * 	 Galicia Cordova 				  *
 * fecha de creacion: 20/03/2023	  * 
 * fecha de modificacion: 21/03/2023  *
 * descripcion: Creacion del algoritmo*
 *  de ordenacion Seleccion 		  *
 *									  *
 ***************************************/

package algoritmos;


public class Selection {
	
	public static void order(int array[]) {
        int menor, index, tmp;
        for (int i = 0; i < array.length - 1; i++) {      
              menor = array[i];                       
              index = i;                            
              for (int j = i + 1; j < array.length; j++){ 
                    if (array[j] < menor) {           
                        menor = array[j];            
                        index = j;
                    }
              }
              if (index != i){                                            
                  tmp = array[i];
                  array[i] = array[index];
                  array[index] = tmp;
              }
        }
	}
}
