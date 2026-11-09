package unidad1.strings;

import java.util.Scanner;

public class Ejercicio9a {
    static void main() {
        /*
        Dado un String, encontrar el número de veces que se repite una determinada letra.
        a) Recorriendo todos los caracteres y buscando la letra.
        b) Reemplazando la letra por “”.
         */

        Scanner sc = new Scanner(System.in);
        String txt;
        char letra;
        int cont = 0;

        System.out.print("Escribe el texto a analizar: ");
        txt = sc.nextLine();

        System.out.print("Que letra deseas buscar: ");
        letra = sc.nextLine().toLowerCase().charAt(0);

        for (int l = 0; l < txt.length(); l++) {
            if (txt.toLowerCase().charAt(l) == letra) {
                cont++;
            }
        }

        System.out.println("La letra " + letra + " se repite un total de " + cont + " veces");

    }
}
