package unidad1.array;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
        y que los almacene en un array. El programa debe ser capaz de pasar todos
        los números pares a las primeras posiciones del array (del 0 en adelante)
        y todos los números impares a las celdas restantes CON ARRAYS AUXILIARES
        */

        Random rng = new Random();
        int[] numeros = new int[20];
        int[] pares;
        int[] impares;
        int cont_p = 0;
        int cont_i = 0;
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rng.nextInt(101);
            if (numeros[i] % 2 == 0) {
                cont_p++;
            } else {
                cont_i++;
            }
        }
        System.out.println(Arrays.toString(numeros));
        pares = new int[cont_p];
        impares = new int[cont_i];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[cont] = numeros[i];
                cont++;
            }
        }

        cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                impares[cont] = numeros[i];
                cont++;
            }
        }
        for (int i = 0; i < pares.length; i++) {
            numeros[i] = pares[i];
        }
        cont = 0;
        for (int i = pares.length; i < numeros.length; i++) {
            numeros[i] = impares[cont];
            cont++;
        }
        System.out.println("Pares: " + Arrays.toString(pares));
        System.out.println("Impares: " + Arrays.toString(impares));
        System.out.println("Reordenado: " + Arrays.toString(numeros));
    }
}