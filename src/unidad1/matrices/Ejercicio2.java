package unidad1.matrices;

public class Ejercicio2 {
    static void main() {
        /*
        Crea un programa que cree una matriz de tamaño 5x5 que almacene
        los números del 1 al 25 y luego muestre la matriz por pantalla.
         */

        int[][] numeros= new int[5][5];
        int cont= 1;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] =cont;
                System.out.print(numeros[i][j] + "\t");
                cont++;
            }
            System.out.println();
        }
    }
}
