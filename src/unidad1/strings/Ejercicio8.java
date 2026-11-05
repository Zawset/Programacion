package unidad1.strings;

import java.util.Scanner;

public class Ejercicio8 {
    static void main() {
        /*
        Dada una cadena de caracteres poner en mayúscula la primera letra de cada palabra.
         */

        Scanner sc = new Scanner(System.in);
        String txt, res = "";

        System.out.print("Escriba el texto: ");
        txt = sc.nextLine();

        String[] mayusculas = txt.split("\\s+");

        for (String mayuscula : mayusculas) {
            res = res.concat(mayuscula.substring(0, 1).toUpperCase())
                    .concat(mayuscula.substring(1).toLowerCase()
                            .concat(" "));
        }

        System.out.println(res);

    }
}
