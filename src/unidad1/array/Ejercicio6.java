package unidad1.array;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        /*
        Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego lo recorra para averiguar
        el máximo y mínimo y mostrarlos por pantalla
         */

        int[] numeros= new int[10];
        Scanner sc= new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero "+(i+1)+":");
            numeros[i]= sc.nextInt();
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("El menor numero introducido fue: "+menor);
        System.out.println("El mayor numero introducido fue: "+mayor);
    }
}
