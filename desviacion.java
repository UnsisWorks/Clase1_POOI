/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import java.util.Scanner;

/**
 *
 * @author jared
 */
public class desviacion {

    public static void main(String args[]) {
        System.out.println("init");
        // create obj scanner
        Scanner input = new Scanner(System.in);
        float media = 0;
        float desvEstandar;
        float suma = 0;

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int numCalf = input.nextInt();
        System.out.println("");

        if (numCalf > 0) {

            float data[] = new float[numCalf];
            for (int i = 0; i < numCalf; i++) {
                System.out.print("Ingrese la calificación: ");
                data[i] = input.nextFloat();
                media += data[i];
                System.out.println("");
            }

            media = media / numCalf;
            System.out.println("Promedio: " + media);

            // Calcular la distancia de la media a los datos
            float dist[] = new float[numCalf];

            for (int i = 0; i < numCalf; i++) {
                dist[i] = (float) Math.pow(data[i] - media, 2);
                suma += dist[i];
            }
            System.out.println("Suma: " + suma);
            desvEstandar = (float) Math.sqrt(suma / numCalf);

            System.out.println("La deviacion estandar es: " + desvEstandar);
        }
        input.close();
    }
}
