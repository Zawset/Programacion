package unidad1.strings;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
        Crea un programa que dado un texto, indique que letras del abecedario no han aparecido en él.
         */

        Scanner sc = new Scanner(System.in);
        String txt;
        String abc = "abcdefghijklmnñopqrstuvwxyz";

        System.out.print("Ingrese el texto: ");
        txt = sc.nextLine().toLowerCase();

        for (int i = 0; i < abc.length(); i++) {
            for (int j = 0; j < txt.length(); j++) {
                if (abc.charAt(i) == txt.charAt(j)) {
                    System.out.print(abc.charAt(i) + " ");
                }
            }
        }
        System.out.println(txt);


    }
}
