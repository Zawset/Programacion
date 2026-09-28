package unidad1.bucles;

import java.util.Scanner;

public class Practica10 {
    /*
    Realiza un programa que sume los 100 números siguientes a un número entero y positivo
    introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
    número positivo)
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println();
            System.out.print("Que numero quieres usar?");
            numero = sc.nextInt();
        }while (numero <0);
        for (int i = 0; i < 101; i++) {
            System.out.println(numero + i);
        }
    }
}
