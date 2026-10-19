package unidad1.array;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        Crea un programa que permita al usuario almacenar una secuencia aritmética
        en un array y luego mostrarla. Una secuencia aritmética es una serie de números
        que comienza por un valor inicial v, y continúa con incrementos de i. Por ejemplo,
        con v=1 e i=2, la secuencia sería 1, 3, 5, 7, 9… Con v=7 e i=10, la secuencia sería 7,
        17, 27, 37… El programa solicitará al usuario v, i además de n (nº de valores a crear)
         */
        int[] aritmetica;
        Scanner sc = new Scanner(System.in);
        int tamano;
        int valor;
        int incremental;

        System.out.print("Cuántos números tendra la secuencia: ");
        tamano = sc.nextInt();
        aritmetica= new int[tamano];
        System.out.println();
        System.out.print("Que numero será el primero: ");
        valor = sc.nextInt();
        System.out.println();
        System.out.print("El incremental será: ");
        incremental = sc.nextInt();
        System.out.println();
        for (int i = 0; i < aritmetica.length; i++) {
            aritmetica[i] = valor;
            if (i != 0){
                aritmetica[i] += incremental * i;
            }
            System.out.println(aritmetica[i]);
        }
    }
}
