package unidad1.strings;

import java.util.Scanner;

public class Ejercicio14 {
    static void main() {
        /*
        Crea un programa que lea por teclado un String correspondiente a un DNI y
        lo divida en una parte entera y un carácter. Para convertir una cadena de caracteres a un
        entero puedes usar el método parseInt de la clase Integer. Comprueba si se trata de un DNI válido:
        8 caracteres numéricos y una letra calculada a partir de la parte numérica.
        Para calcular la letra del DNI, debemos dividir el número entre 23 y quedarnos con el resto.
        El resto, que estará entre 0 y 22, está asociado a una letra según la siguiente tabla. Para
        guardar las letras del DNI puedes usar un array o un String.
        Puedes reutilizar un ejercicio parecido, visto en la tarea de arrays.
         */

        Scanner sc= new Scanner(System.in);
        String letrasDNI ="TRWAGMYFPDXBNJZSQVHLCKE";
        String dni;
        int numero;
        char letra;

        do {
            System.out.print("DNI: ");
            dni = sc.nextLine().toUpperCase();
        }while (!dni.matches("^[0-9]{8}[A-Z]$"));
        System.out.println("Comprobar letra de DNI...");

        numero= Integer.parseInt(dni.substring(0,8));
        letra = dni.charAt(8);


        if (letra == letrasDNI.charAt(numero % 23)){
            System.out.println("La letra está correcta.");
        }else {
            System.out.println("La letra es incorrecta, la letra debería ser: "+letrasDNI.charAt(numero % 23));
        }
    }
}
