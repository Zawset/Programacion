package unidad1.array;

import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
        y que los almacene en un array. El programa debe ser capaz de pasar todos
        los números pares a las primeras posiciones del array (del 0 en adelante)
        y todos los números impares a las celdas restantes
        */

        Random rng = new Random();
        int[] numeros = new int[20];
        int[] pares;
        int[] impares;
        int cont_p=0;
        int cont_i=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rng.nextInt(101);
            if (numeros[i] %2==0){
                cont_p++;
            }
        }
    }
}