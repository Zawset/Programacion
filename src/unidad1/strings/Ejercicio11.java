package unidad1.strings;

import java.util.Scanner;

public class Ejercicio11 {
    static void main() {

        /*
        Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
        el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.) aunque sí
        podrá introducir mayúsculas y minúsculas. Un palíndromo es un texto que se lee igual de izquierda
        a derecha que de derecha a izquierda.
        */

        Scanner sc = new Scanner(System.in);

        String txt1, formateado1;
        String formateado2 = "";

        System.out.print("Escribe el texto: ");
        txt1 = sc.nextLine().toLowerCase();

        formateado1 = txt1.replaceAll(" ", "");

        for (int i = formateado1.length()-1; i >= 0 ; i--) {
            formateado2 += formateado1.charAt(i);
        }

        if (formateado1.equals(formateado2)){
            System.out.println("Es un palíndromo");
        }else {
            System.out.println("No es palíndromo");
        }
    }
}

