package unidad1.bucles;

import java.util.Scanner;

public class Practica9 {
    /*Escribe un programa que diga si un número introducido por teclado es o no primo.
    Un número primo es aquel que sólo es divisible entre él mismo y la unidad
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int i = 1;

        System.out.print("Escribe el número para saber si es primo: ");
        numero = sc.nextInt();

        while (i!=-1 && i<numero/2){
            i++;

            if (numero % i == 0){
                i=-1;
            }
        }
        if (i ==-1){
            System.out.println(numero + " no es un número primo");
        }else System.out.println(numero + " es un número primo");
    }
}
