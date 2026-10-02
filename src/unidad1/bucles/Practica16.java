package unidad1.bucles;

import java.util.Scanner;

public class Practica16 {
    /*
    Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación
    los 5 números consecutivos a partir del número introducido. Al lado de cada número se debe indicar
    si se trata de un primo o no.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int x = sc.nextInt();
        for (int numero= x; numero <= x+5; numero++) {
            int i = 2;
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

}
