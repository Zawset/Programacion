package unidad1.array;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        int[] numeros= new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe el número en la posicion "+ (i+1) +":");
            numeros[i]= sc.nextInt();
        }
        System.out.println("Números en orden inverso;");
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
