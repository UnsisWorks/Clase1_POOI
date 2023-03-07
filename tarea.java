import java.util.Scanner;

public class tarea {
    public static void main(String args[]) {
        
        // create obj scanner
        Scanner input = new Scanner(System.in);
        float media = 0;

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int numCalf = input.nextInt();
        System.out.println("");

        if (numCalf > 0) {
            
            for (int i = 0; i < numCalf; i++) {   
                System.out.print("Ingrese la calificación: ");
                media += input.nextFloat();
                System.out.println("");
            }

            System.out.println("Promedio: " + media / numCalf);
        }
        input.close();
    }
}