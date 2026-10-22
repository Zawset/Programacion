package unidad1.array;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio15b {
    static void main() {
         /*
        Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
        y que los almacene en un array. El programa debe ser capaz de pasar todos
        los números pares a las primeras posiciones del array (del 0 en adelante)
        y todos los números impares a las celdas restantes SIN ARRAYS AUXILIARES
        */
        Random rng = new Random();
        int[] numeros = new int[20];
        int posicion_par = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= rng.nextInt(101);
        }
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]% 2==0){
                int temp= numeros[i];

                for (int j = i; j > posicion_par; j--) {
                    numeros[j] = numeros[j-1];
                }
                numeros[posicion_par]= temp;
                posicion_par++;
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
