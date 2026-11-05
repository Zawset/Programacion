package unidad1.strings;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        /*
        Realiza un programa que lea por teclado una cadena de caracteres y la muestre por pantalla al revés
         */

        Scanner sc = new Scanner(System.in);

        String txt;

        System.out.print("Escribe el texto del derecho: ");
        txt = sc.nextLine();

        for (int i = txt.length()-1; i >= 0; i--) {
            System.out.print(txt.charAt(i));
        }

    }
}
