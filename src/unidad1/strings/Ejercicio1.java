package unidad1.strings;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {

        /*
        Crea un programa que pida una cadena de texto por teclado y
        luego muestre cada carácter de la cadena en una línea distinta.
         */
        Scanner sc = new Scanner(System.in);

        String txt;

        System.out.print("Escribe el texto que le interese: ");
        txt = sc.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            System.out.println(txt.charAt(i));
        }
    }
}
