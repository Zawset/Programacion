package unidad1.array;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida la temperatura media que ha hecho en cada
        mes de un determinado año y que muestre a continuación un diagrama de
        barras horizontales con esos datos. Las barras del diagrama se pueden
        dibujar con asteriscos.
         */

        Scanner sc = new Scanner(System.in);
        int[] meses = new int[12];

        for (int i = 0; i < meses.length; i++) {
            System.out.println("Temperatura en el mes " + (meses[i] + 1));
        }

    }
}
