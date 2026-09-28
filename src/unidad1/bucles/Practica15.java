package unidad1.bucles;

import java.util.Scanner;

public class Practica15 {
    /*
    Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la
    semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana se
    pedirá como un número (del 1 al 7). Se debe comprobar que el usuario introduce los datos
    correctamente y que el segundo día es posterior al primero.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas;
        int dia;
        int diferenciaDias;
        int diferenciaHoras;

        System.out.println("Que dia de la semana era?");
        dia = sc.nextInt();
        System.out.println();
        System.out.println("Que hora era?");
        horas = sc.nextInt();
        System.out.println();
        do {
            System.out.println("Que dia es hoy");
            diferenciaDias = sc.nextInt() - dia;
            if (diferenciaDias < 0) {
                System.out.println("Error, numero erróneo detectado");
            }
        }while (diferenciaDias <0 || diferenciaDias >7);
        System.out.println();
        System.out.println("Que hora es ahora mismo:");
        diferenciaHoras= sc.nextInt() - horas;
        System.out.println("Las horas de diferencia son: " + diferenciaDias*24+diferenciaHoras);
    }
}