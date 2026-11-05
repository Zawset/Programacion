package unidad1.strings;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        /*
        Realiza un programa que lea por teclado una cadena de caracteres y una
        letra y muestre cuántas veces se repite esa letra en la cadena. Se considerarán
        iguales las letras mayúsculas y minúsculas.
         */

        Scanner sc= new Scanner(System.in);

        String txt;
        char letra;
        int cont = 0;

        System.out.print("Escriba la cadena de texto: ");
        txt = sc.nextLine();
        System.out.println();
        System.out.print("Escribe la letra que buscar: ");
        letra = sc.nextLine().charAt(0);
        txt = txt.toLowerCase();

        for (int l = 0; l < txt.length(); l++) {
            if (txt.charAt(l) == letra){
                cont ++;
            }
        }
        System.out.println("La letra "+letra+" se repite "+cont+" veces");
    }
}
