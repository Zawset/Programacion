package unidad1.array;

import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {

        /*
        Define tres arrays de 20 números enteros cada uno, con nombres numeros,
        cuadrados y cubos. Carga el array numeros con valores aleatorios entre 0 y 100.
        En el array cuadrados se deben almacenar los cuadrados de los valores que hay
        en el array numeros.
        En el array cubos se deben almacenar los cubos de los valores que hay en numeros.
        A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.
         */

        Random rng = new Random();
        int [] numeros = new int[20];
        int [] cuadrados = new int[20];
        int [] cubo = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rng.nextInt(0,101);
            cuadrados[i] = numeros[i]*numeros[i];
            cubo[i] = cuadrados[i]*numeros[i];

            System.out.printf("%-15s %-15s %-15s",numeros[i],  cuadrados[i], cubo[i]);
            System.out.println();
        }
    }
}
