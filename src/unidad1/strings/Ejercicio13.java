package unidad1.strings;

import java.util.Scanner;

public class Ejercicio13 {
    static void main() {
        /*
        Crea un programa que lea por teclado un nombre y dos apellidos y forme un String con
        el nombre y los apellidos. El programa debe asegurarse de que tanto el nombre como los
        dos apellidos empiezan por mayúsculas
         */

        Scanner sc = new Scanner(System.in);

        String nombre;
        String apellido1;
        String apellido2;
        String entero;

        System.out.print("Escribe el nombre: ");
        nombre = sc.nextLine().toLowerCase();

        System.out.print("Escribe el primer apellido: ");
        apellido1 = sc.nextLine().toLowerCase();

        System.out.print("Escribe el segundo apellido: ");
        apellido2 = sc.nextLine().toLowerCase();

        entero = nombre.substring(0,1).toUpperCase()
                .concat(nombre.substring(1))
                .concat(" ")
                .concat(apellido1.substring(0,1).toUpperCase())
                .concat(apellido1.substring(1))
                .concat(" ")
                .concat(apellido2.substring(0,1).toUpperCase())
                .concat(apellido2.substring(1));

        System.out.println(entero);
    }
}
