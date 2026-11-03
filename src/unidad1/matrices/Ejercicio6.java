package unidad1.matrices;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        /*
        Necesitamos crear un programa para almacenar las notas de 4 alumnos
        (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario
        introducirá las notas por teclado y luego el programa mostrará la nota
        mínima, máxima y media de cada alumno.
         */

        Scanner sc = new Scanner(System.in);

        String[] nomes = {"Alumno 1","Alumno 2","Alumno 3","Alumno 4"};
        String[] asignaturas={"LIMA","BBDD","PROG","CONT","SIST"};
        int[][] notas = new int[nomes.length][asignaturas.length];
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int media = 0;

        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                System.out.print("Notas de " + nomes[f] + " en " + asignaturas[c]+":");
                notas[f][c] = sc.nextInt();
                if (notas[f][c] > mayor){
                    mayor = notas[f][c];
                }
                if (notas[f][c] < menor){
                    menor = notas[f][c];
                }
                media += media;
            }
        }

    }
}
