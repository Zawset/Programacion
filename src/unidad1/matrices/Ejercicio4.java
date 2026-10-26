package unidad1.matrices;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        /*
        Crea un programa que cree una matriz de tamaño NxM
        (tamaño introducido por teclado) e introduzca en ella
        valores (también introducidos por teclado). Luego deberá
        recorrer la matriz y al final mostrar por pantalla cuántos
        valores son mayores que cero, cuántos son menores que cero
        y cuántos son igual a cero
         */

        Scanner sc = new Scanner(System.in);
        int [][] numero;
        int filas, columnas;
        int mayores= 0;
        int menores= 0;
        int iguales= 0;

        System.out.print("Cuantas filas tendrá el array: ");
        filas = sc.nextInt();
        System.out.println();

        System.out.print("Cuantas columnas tendrá la matriz: ");
        columnas= sc.nextInt();
        System.out.println();

        numero=new int[filas][columnas];

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Escriba el numero de la posicion (" +(i+1)+", " + (j+1)+"):");
                numero[i][j] = sc.nextInt();
                if (numero[i][j] > 0){
                    mayores++;
                }else if (numero[i][j] < 0){
                    menores++;
                }else {
                    iguales++;
                }
            }
        }
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(numero[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Hay: "+mayores+" números mayores que 0");
        System.out.println("Hay: "+menores+" números menores que 0");
        System.out.println("Hay: "+iguales+" números iguales que 0");
    }
}
