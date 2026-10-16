package unidad1.array;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
            Crea un programa que cree dos arrays de enteros de tamaño 100.
            Luego introducirá en el primer array  valores aleatorios del 1 al 100.
            Por último, deberá copiar todos los valores del primer array al segundo
            array en orden inverso, y mostrar ambos por pantalla.
         */

        Random rng = new Random();
        
        int[] arrayOriginal = new int[5];
        int[] arrayInverso = new int[5];

        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOriginal[i] = rng.nextInt(1,101);
            System.out.print(arrayOriginal[i] + "\t");
        }
        System.out.println();
        System.out.println("-------------------------------");
        for (int i = 0; i < arrayInverso.length; i++) {
            arrayInverso[i]= arrayOriginal[arrayOriginal.length - 1 - i];
            System.out.print(arrayInverso[i] + "\t");

        }
    }
}
