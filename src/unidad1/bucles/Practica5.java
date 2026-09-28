package unidad1.bucles;

import java.util.Scanner;

public class Practica5 {
    /*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
     El programa nos pedirá la combinación para abrirla.
     Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
     y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
     Tendremos cuatro oportunidades para abrir la caja fuerte.
     */
    public static void main(String[] args) {
        int combinacion = 1234;
        int escrito;
        int intentos = 4;

        Scanner sc = new Scanner(System.in);

        System.out.println("CAJA FUERTE ACTIVADA");
        System.out.println("Escriba la combinación de apertura, tienes "+intentos +" intentos");
        while (intentos > 0){
            escrito = sc.nextInt();
            if (escrito!=combinacion){
                intentos--;
                System.out.println("Combinación incorrecta, le quedan " + intentos + " intentos");
            }
            if (escrito==combinacion){
                intentos = -1;
            }
        }
        if (intentos!=-1){
            System.out.println("CAJA BLOQUEADA, ACTIVANDO ALARMA");
        }else {
            System.out.println("ABRIENDO PUERTAS");
        }
    }
}
