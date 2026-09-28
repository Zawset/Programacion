package unidad1.bucles;

import java.util.Scanner;

public class Practica13 {
    /*
    Escribe un programa que permita ir introduciendo una serie indeterminada de números
    mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
    total acumulado, la cantidad de números introducidos y la media.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 0;
        int suma = 0;
        int MAX_VALUE = 10000;

        while(suma <= MAX_VALUE){
            System.out.print("Introduzca número: ");
            numero = sc.nextInt();
            contador ++;
            suma += numero;
            System.out.println("LLevas "+suma+" en total");
        }
        System.out.println("MAXIMO ALCANZADO:");
        System.out.println("Se han introducido "+contador+" números");
        System.out.println("La media de los números es "+ suma/contador);
    }
}
