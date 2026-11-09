package unidad1.strings;

import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        /*
        Dado un string, encontrar el número de letras y números en él:
        puedes utilizar los métodos isDigit() e isLetter() de la clase Character.
         */

        Scanner sc = new Scanner(System.in);

        String txt;
        int contN = 0, contL = 0;

        System.out.print("Escriba su texto aquí: ");
        txt=sc.nextLine();

        for (int c = 0; c < txt.length(); c++) {
            if (Character.isLetter(txt.charAt(c))){
                contL ++;
            }
            if (Character.isDigit(txt.charAt(c))){
                contN ++;
            }
        }
        System.out.println("Hay un total de " + contL + " letras y " + contN + " números en el texto:");
        System.out.println(txt);
    }
}
