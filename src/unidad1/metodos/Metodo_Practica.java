package unidad1.metodos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Metodo_Practica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  EJERCICIO 1
        System.out.print("Ingrese texto: ");
        String txt = sc.nextLine();
        mostrarTextoMayusculas(txt);
        System.out.println(txt);

        // EJERCICIO 2
        System.out.print("Ingrese el número: ");
        int numero = sc.nextInt(); sc.nextLine();
        mostrarValorAbsoluto(numero);
        System.out.println(numero);

        //EJERCICIO 3
        int[] array = new int[10];
        rellenarArray(array);
        System.out.println(Arrays.toString(array));
    }
    static void mostrarTextoMayusculas(String texto){
        /*
        EJERCICIO 1
            Recibe un texto por parámetro. Lo convierte a mayúsculas. Lo muestra en pantalla
         */
        texto = texto.toUpperCase();
        System.out.println(texto);

    }
    static void mostrarValorAbsoluto(int numero){
        /*
        EJERCICIO 2
            Recibe un número entero por parámetro (positivo o negativo).
            Lo convierte a positivo.
            Lo muestra en pantalla.
         */
        if (numero < 0){
            numero = numero * -1;
            System.out.println(numero);
        }
    }
    static void rellenarArray(int[] array){
        /*
        EJERCICIO 3
            Recibe array de enteros.
            Lo rellena con números aleatorios.
         */

        Random rng = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rng.nextInt(101);
        }
        System.out.print(Arrays.toString(array));

    }
}
