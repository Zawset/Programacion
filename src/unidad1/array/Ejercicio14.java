package unidad1.array;

import java.util.Arrays;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
        Crea un programa que cree un array de enteros e introduzca la siguiente secuencia
        de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez
        veces, y luego la muestre por pantalla.
         */

        int[] numeros;
        numeros = new int[55];
        int cont=0;
        for (int i = 1; i <= 10; i++) {
            numeros[cont] = i;
            for (int j = 0; j < numeros[i]; j++) {

            }
            cont++;
        }

        System.out.println();
        System.out.println(Arrays.toString(numeros));

    }
}
