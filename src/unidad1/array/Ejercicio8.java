package unidad1.array;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        /*
        Crea un programa que pida dos valores enteros P y Q,
        luego cree un array que contenga todos los valores desde
        P hasta Q, y lo muestre por pantalla.
         */

        int p, q;
        int[] arrayCreado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el numero inicial: ");
        p = sc.nextInt();
        System.out.print("Dime el numero que acaba el Array: ");
        q = sc.nextInt();

        arrayCreado = new int[q - p + 1];
        for (int i = 0; i < arrayCreado.length; i++) {
            arrayCreado[i] = p + i;
            System.out.println(arrayCreado[i]);
        }
    }
}
