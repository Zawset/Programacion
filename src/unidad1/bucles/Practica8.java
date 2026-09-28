package unidad1.bucles;

import java.util.Scanner;

public class Practica8 {
    //Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int negativo = 0;
        int positivo = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println("Escribe un numero ("+i+"/10)");
            numero = sc.nextInt();
            if (numero >= 0){
                positivo++;
            }else negativo++;
        }
        System.out.println("Hay "+positivo+" números positivos");
        System.out.println("Hay "+negativo+" números negativos");
    }
}
