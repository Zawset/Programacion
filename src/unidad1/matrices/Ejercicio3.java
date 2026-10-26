package unidad1.matrices;

public class Ejercicio3 {
    static void main() {
        /*
        Crea un programa que cree una matriz de 10x10 e introduzca
        los valores de las tablas de multiplicar del 1 al 10 (cada tabla
        en una fila). Luego mostrará la matriz por pantalla.
         */
        int[][] tabla = new int[10][10];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < 10; j++) {
                tabla[i][j] = (i+1) * (j+1);
                System.out.print( (i+1)+" x "+(j+1) +" = "+ tabla[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
