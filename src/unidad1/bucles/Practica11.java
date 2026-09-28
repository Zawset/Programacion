package unidad1.bucles;

import java.util.Scanner;

public class Practica11 {
    /*
    Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
    negativo y nos diga cuantos números se han introducido, la media de los impares y el
    mayor de los pares. El número negativo sólo se utiliza para indicar el final de
    introducción de datos pero no se incluye en el cómputo
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        double impares = 0;
        int pares = 0;
        int cont = 0;
        int contImpar = 0;

        do {
            System.out.print("Escriba el número (Negativo para terminar): ");
            numero = sc.nextInt();
            if (numero>=0) {
                if (numero % 2 == 0) {
                    if (numero > pares) pares = numero;
                } else {
                    impares += numero;
                    contImpar++;
                }
                cont++;
            }
        }while (numero >=0);
        System.out.println("Habia " + cont + " números en total");
        System.out.println("El numero "+pares+" fue el número par más grande");
        System.out.println("La media de los número impares es "+ impares/contImpar);
    }
}
