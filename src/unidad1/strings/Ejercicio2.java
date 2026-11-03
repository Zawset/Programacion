package unidad1.strings;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() throws InterruptedException {
        /*
        Crea un programa que pida dos cadenas de texto por teclado
        y luego indique si son iguales además de si son iguales sin diferenciar
        entre mayúsculas y minúsculas
         */
        Scanner sc = new Scanner(System.in);

        String txt1;
        String txt2;
        int i = 0;

        System.out.print("Introduce el primer texto: ");
        txt1 = sc.nextLine();
        System.out.println("Clonando letras...");
        Thread.sleep(2000);
        System.out.println("Enviando texto a la base de datos Tel Aviv...");
        Thread.sleep(3000);
        System.out.println("Texto guardado");
        System.out.println();
        System.out.print("Escriba el segundo texto: ");
        txt2 = sc.nextLine();
        System.out.println("Clonando letras...");
        Thread.sleep(2000);
        System.out.println("Enviando texto a la base de datos Tel Aviv...");
        Thread.sleep(3000);
        System.out.println("Texto guardado");
        Thread.sleep(2000);
        System.out.println("Comprobando parecidos en la Sinagoga...");
        Thread.sleep(5000);
        System.out.println("El resultado es...");
        Thread.sleep(3000);

        while (i < txt1.length() && txt1.toLowerCase().charAt(i) == txt2.toLowerCase().charAt(i)){
            i++;
        }
        if (i != txt1.length()){
            System.out.println("Los textos son distintos");
        }else {
            System.out.println("Los textos son iguales");
        }
    }
}
