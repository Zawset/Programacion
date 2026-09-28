package unidad1.bucles;

import java.util.Scanner;

public class Practica14 {
    /*
    Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int cont = 0;
        int suma = 0;
        int i = 3;
        System.out.print("Dime el número: ");
        numero = sc.nextInt();

        while (i < numero){
            System.out.println(i);
            cont++;
            suma +=1;
            i+=3;
        }
        System.out.println("Se encontraron "+cont);
        System.out.println(suma + ": Suma total de los multiplos");
    }
}
