package unidad1.strings;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Ejercicio9b {
    static void main() {

        /*
        Dado un String, encontrar el número de veces que se repite una determinada letra.
        a) Recorriendo todos los caracteres y buscando la letra.
        b) Reemplazando la letra por “”.
         */

        Scanner sc = new Scanner(System.in);
        String txt;
        String letra;
        int res = 0;

        System.out.print("Escriba aquí su texto: ");
        txt = sc.nextLine().toLowerCase();
        res = txt.length();

        System.out.print("Que letra quieres buscar: ");
        letra = sc.nextLine().toLowerCase();

        txt = txt.replace(letra, "");
        res -= txt.length();

        System.out.println("Hay un total de " + res + " " + letra + " en el texto");
    }
}
