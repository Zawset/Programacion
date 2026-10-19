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
        String[] nombres = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int[] meses = new int[12];
        int temperatura = 0;

        for (int i = 0; i < meses.length; i++) {
            System.out.print("Temperatura en el mes " + (nombres[i])+": ");
            meses[i] = sc.nextInt();
            System.out.println();
        }
        for (int i = 0; i < meses.length; i++) {
            System.out.print("Mes " + (nombres[i])+":");
            for (int j = meses[i]; j > temperatura; temperatura++) {
                System.out.print("*");
            }
            System.out.println();
            temperatura = 0;
        }

    }
}
