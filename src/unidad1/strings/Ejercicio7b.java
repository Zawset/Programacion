package unidad1.strings;

import java.util.Scanner;

public class Ejercicio7b {
    static void main() {
         /*
        Realiza un programa que lea por teclado una cadena de caracteres y cuente el número de palabras
        que contiene. La cadena sólo contendrá letras y espacios (sin comas, puntos, etc.):
         a) Recorriendo todos los caracteres y buscando espacios.
         b) Utilizando el método split().
         */

        Scanner sc= new Scanner(System.in);
        String txt;

        System.out.print("Escriba el texto: ");

        txt = sc.nextLine();

        String[] palabras = txt.split("\\s+");
        System.out.println("La cadena tiene "+ palabras.length + " palabras");

    }
}
