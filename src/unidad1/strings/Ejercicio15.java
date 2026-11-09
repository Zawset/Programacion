package unidad1.strings;

import java.util.Scanner;

public class Ejercicio15 {
    static void main() {
        /*
        Crea un programa que dada una frase encuentre la palabra de mayor
        longitud. El programa debe imprimir la palabra y el número de caracteres de la misma
         */

        Scanner sc = new Scanner(System.in);

        String txt;
        String mayor = "";
        int caracteres = Integer.MIN_VALUE;

        System.out.print("Escribe tu textazo: ");
        txt = sc.nextLine();

        String[] palabras = txt.split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > caracteres){
                caracteres = palabras[i].length();
                mayor = palabras[i];
            }
        }
        System.out.println("La palabra mas larga es ".concat(mayor).concat(" con " + caracteres + " letras"));
    }
}
