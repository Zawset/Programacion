package unidad1.strings;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        /*
        Crea un programa que pida por teclado tres cadenas de texto: nombre y
        dos apellidos. Luego mostrará un código de usuario (en mayúsculas) formado
        por la concatenación de las tres primeras letras de cada uno de ellos. Por
        ejemplo si se introduce “Manuel”, “González” y “Fernández” mostrará “MANGONFER”.
         */
        Scanner sc = new Scanner(System.in);

        String nombre;
        String apellido1;
        String apellido2;

        String resultado;
        System.out.print("Escribe el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Escribe el primer apellido: ");
        apellido1 = sc.nextLine();
        System.out.print("Escribe el segundo apellido: ");
        apellido2 = sc.nextLine();

        resultado = nombre.substring(0,2).toUpperCase()+apellido1.substring(0,2).toUpperCase()+apellido2.substring(0,2).toUpperCase();
        System.out.println(resultado);
    }
}
