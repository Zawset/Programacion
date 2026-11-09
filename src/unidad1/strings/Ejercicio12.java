package unidad1.strings;

import java.util.Scanner;

public class Ejercicio12 {
    static void main() {
        /*
        Dadas dos palabras, verificar si son anagramas. Supondremos que el usuario solo
        introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.) aunque sí
        podrá introducir mayúsculas y minúsculas. Dos palabras son anagramas si están
        formadas por las mismas letras cambiadas de orden.
         */

        Scanner sc = new Scanner(System.in);
        String txt1;
        String txt2;
        int cont = 0;

        System.out.print("Introduzca la palabra: ");
        txt1 = sc.nextLine().toLowerCase().replaceAll(" ","");
        System.out.print("Introduce otra palabra: ");
        txt2 = sc.nextLine().toLowerCase().replaceAll(" ","");

        String[] letras = txt1.split("");

        for (int i = 0; i < letras.length; i++) {
            if (!txt2.contains(letras[i])){
                cont++;
            }
        }
        if (cont != 0){
            System.out.println("Las palabras no SON🥀 anagramas");
        }else {
            System.out.println("Las palabras SON🥀 anagramas");
        }
    }
}
