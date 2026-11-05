package unidad1.strings;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        /*
        Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
        (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No
        se debe diferenciar entre mayúsculas y minúsculas.
         */
        Scanner sc = new Scanner(System.in);

        String txt;
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        System.out.print("Escribe el texto YA: ");
        txt = sc.nextLine();
        txt = txt.toLowerCase();
        for (int j = 0; j < txt.length(); j++) {
            switch (txt.charAt(j)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;

            }
        }
        System.out.println("Hay un total de:");
        System.out.println(a + " As");
        System.out.println(e + " Es");
        System.out.println(i + " Is");
        System.out.println(o + " Os");
        System.out.println(u + " Us");

    }

}
