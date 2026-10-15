package unidad1.array;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        /*Crea un programa que pida veinte números enteros por teclado,
        los almacene en un array y luego muestre por separado la suma de todos los
        valores positivos y negativos.
         */

        int[] numeros = new int[20];
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1)+": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0) {
                positivos += numeros[i];
            } else {
                negativos += numeros[i];
            }
        }
        System.out.println("Suma de positivos: " + positivos);
        System.out.println("Suma de negativos: " + negativos);
    }
}
