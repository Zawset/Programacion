package unidad1.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        /*
        Crea un programa que pida dos valores enteros N y M,
        luego cree un array de tamaño N, escriba M en todas sus
        posiciones y lo muestre por pantalla
         */

        Scanner sc = new Scanner(System.in);
        int n, m;
        int[] arrayCreado;

        System.out.print("Dime la extensión del Array: ");
        n = sc.nextInt();
        System.out.println("Dime que número estará en las posiciones del array");
        m = sc.nextInt();
        arrayCreado = new int[n];
        Arrays.fill(arrayCreado, m);
        for (int i : arrayCreado) {
            System.out.println(i);
        }
    }
}
