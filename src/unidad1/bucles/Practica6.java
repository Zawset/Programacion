package unidad1.bucles;

import java.util.Scanner;

public class Practica6 {
    //Muestra la tabla de multiplicar de un número introducido por teclado.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplo;

        System.out.print("De que número va a ser la tabla de multiplicar: ");
        multiplo = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(multiplo+" * "+i+" = "+multiplo*i);
        }
    }
}
