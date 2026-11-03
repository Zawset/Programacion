package unidad1.matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        /*
        Escribe un programa que pida 20 números enteros. Estos números se deben
        introducir en un array de 4 filas por 5 columnas (si lo prefieres también
        los puedes generar de forma aleatoria). El programa mostrará las sumas
        parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
        La suma total debe aparecer en la esquina inferior derecha.
         */

        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        int[][] tabla = new int[4][5];
        int suma;
        int sumaT = 0;

        for (int f = 0; f < tabla.length; f++) {
            suma = 0;
            for (int c = 0; c < tabla[f].length; c++) {
                tabla[f][c] = rng.nextInt(51);
                System.out.print(tabla[f][c] + "\t");
                suma += tabla[f][c];
            }
            System.out.print(" | " + suma);
            System.out.println();
        }
        System.out.println("-\t".repeat(tabla[0].length) + " - ");
        for (int c = 0; c < tabla[0].length; c++) {
            suma = 0;
            for (int f = 0; f < tabla.length; f++) {
                suma += tabla[f][c];
                sumaT += suma;
            }
            System.out.print(suma + "\t");
        }
        System.out.println("\t" + sumaT);


    }
}
