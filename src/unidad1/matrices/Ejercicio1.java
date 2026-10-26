package unidad1.matrices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio1 {
    static void main() {
        /*
        Define un array de números enteros de 3 filas por 6 columnas y asigna los
        valores según la siguiente tabla. Muestra el contenido de todos los elementos
        del array dispuestos en forma de tabla como se muestra en la figura.
         */

        int[][] numeros = new int[3][6];

        numeros[0][0]= 0;
        numeros[0][1]= 30;
        numeros[0][2]= 2;
        numeros[0][5]= 5;
        numeros[1][0]= 75;
        numeros[1][4]= 0;
        numeros[2][2]= -2;
        numeros[2][3]= 9;
        numeros[2][5]= 11;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
