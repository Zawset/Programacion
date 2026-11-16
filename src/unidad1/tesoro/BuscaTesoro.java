package unidad1.tesoro;

import java.util.Random;
import java.util.Scanner;

public class BuscaTesoro {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static final int FILAS = 5, COLS = 5;
    static final char TESORO = '€';
    static final char MINA = '*';
    static final char PIUM = 'X';

    static void main() {

        char[][] tablero = new char[FILAS][COLS];

        iniciarTablero(tablero, 3, 1);
        mostrarTablero(tablero);


    }

    static void iniciarTablero(char[][] tablero, int numMinas, int numTesoros) {
        
    }

    static void mostrarTablero(char[][] tablero) {
        int n = tablero.length;

        // 1. Encabezado de columnas (0   1   2...)
        System.out.print("   ");
        for (int col = 0; col < n; col++) {
            // %-4d alinea el número a la izquierda ocupando 4 espacios (mantiene el diseño incluso con 2 dígitos)
            System.out.printf("%-4d", col);
        }
        System.out.println();

        // 2. Borde superior (┌───┬───┬───┐)
        System.out.print(" ┌");
        for (int col = 0; col < n; col++) {
            System.out.print("───" + (col < n - 1 ? "┬" : "┐"));
        }
        System.out.println();

        // 3. Filas y separadores intermedios
        for (int fila = 0; fila < n; fila++) {
            System.out.print(fila + "│");
            for (int col = 0; col < n; col++) {
                System.out.print(" " + tablero[fila][col] + " │");
            }
            System.out.println();

            // Separador entre filas (├───┼───┼───┤)
            if (fila < n - 1) {
                System.out.print(" ├");
                for (int col = 0; col < n; col++) {
                    System.out.print("───" + (col < n - 1 ? "┼" : "┤"));
                }
                System.out.println();
            }
        }

        // 4. Borde inferior (└───┴───┴───┘)
        System.out.print(" └");
        for (int col = 0; col < n; col++) {
            System.out.print("───" + (col < n - 1 ? "┴" : "┘"));
        }
        System.out.println();

        System.out.println("\nPulsa Intro para continuar....");
        sc.nextLine();
    }
}

