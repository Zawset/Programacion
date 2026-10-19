package unidad1.array;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
        Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
        por pantalla separados por espacios.
        El programa pedirá entonces por teclado dos valores y a continuación cambiará en el
        array todas las ocurrencias del primer valor por el segundo.
        A continuación, se mostrará otra vez el array y los números que se han cambiado deben
        aparecer entrecomillados.
         */
        int[] numeros = new int[5];
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);
        int viejo, nuevo;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rng.nextInt(0, 21);
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.print("Que número deseas cambiar: ");
        viejo = sc.nextInt();
        System.out.println();
        System.out.print("Que número lo sustituirá: ");
        nuevo = sc.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == viejo) {
                numeros[i] = nuevo;
                System.out.print("\""+numeros[i]+"\" ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
