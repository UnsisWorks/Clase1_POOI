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
public class rango {
    public static void main(String[] args) {
        
        // create obj scanner
        Scanner input = new Scanner(System.in);
        float max = 0;
        float min = 9999999;
        float rango;

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int numCalf = input.nextInt();
        System.out.println("");

        if (numCalf > 0) {

            float data[] = new float[numCalf];
            
            for (int i = 0; i < numCalf; i++) {
                System.out.print("Ingrese la calificación: ");
                data[i] = input.nextFloat();
                System.out.println("");
            }
            
            for (float dato : data) {
                if (dato > max) {
                    max = dato;
                } else if (dato < min) {
                    min = dato;
                }
            }
            
            System.out.println("max: " + max + "min: " + min);
            rango = max - min;
            System.out.println("Rango: " + rango);
        }
        input.close();
    }
}
