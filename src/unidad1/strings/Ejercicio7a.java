package unidad1.strings;

import java.util.Scanner;

public class Ejercicio7a {
    static void main() {
        /*
        Realiza un programa que lea por teclado una cadena de caracteres y cuente el número de palabras
        que contiene. La cadena sólo contendrá letras y espacios (sin comas, puntos, etc.):
         a) Recorriendo todos los caracteres y buscando espacios.
         b) Utilizando el método split().
         */

        Scanner sc= new Scanner(System.in);
        String txt;
        int cont = 1;

        System.out.print("Escriba el texto: ");

        txt = sc.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == ' ' && txt.charAt(i+1) != ' '){
                cont ++;
            }
        }

        System.out.println("Hay "+cont+" palabras");
    }
}
