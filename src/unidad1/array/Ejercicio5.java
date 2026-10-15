package unidad1.array;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        /*Crea un array de 7 cadenas de texto (String) llamado diasSemana.
        Guarda en el array los nombres de los días de la semana (Lunes a Domingo).
        Crea un programa que lea un número por teclado (de 1 a 7) y, consultando el array,
        diga el nombre del día de la semana que se corresponde con ese número.
         */
        String[] semana = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};

        Scanner sc= new Scanner(System.in);
        int dia;
        System.out.print("Dime un número del 1 al 7: ");
        dia = sc.nextInt()-1;
        System.out.println(semana[dia]);
    }
}
