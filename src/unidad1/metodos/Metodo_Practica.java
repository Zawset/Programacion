package unidad1.metodos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Metodo_Practica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  EJERCICIO 1
        System.out.print("Ingrese texto: ");
        String txt = sc.nextLine();
        mostrarTextoMayusculas(txt);
        System.out.println(txt);

        // EJERCICIO 2
        System.out.print("Ingrese el número: ");
        int numero = sc.nextInt(); sc.nextLine();
        mostrarValorAbsoluto(numero);
        System.out.println(numero);

        //EJERCICIO 3
        int[] array = new int[10];
        rellenarArray(array);
        System.out.println(Arrays.toString(array));

        //EJERCICIO 5
        int n1 ,n2;
        System.out.print("Escribe el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Escribe el primer numero: ");
        n2 = sc.nextInt();

        mostrarMayor(n1,n2);

        //EJERCICIO 6
        int dni;
        char letra;
        System.out.print("Dame el numero del DNI: ");
        dni = sc.nextInt();
        sc.nextLine();
        System.out.print("Cual es la letra: ");
        letra = sc.nextLine().charAt(0);
        mostrarDNI(dni,letra);

        //EJERCICIO 7
        String primeraLetraMayor;
        System.out.print("Escriba el texto: ");
        primeraLetraMayor = sc.nextLine();
        primeraLetraMayor = convertirPrimeraLetraMayusculas(primeraLetraMayor);
        System.out.println(primeraLetraMayor);

        //EJERCICIO 8
        int numero1, numero2;
        System.out.print("Numero 1: ");
        numero1 = sc.nextInt();
        System.out.print("Numero 2: ");
        numero2 = sc.nextInt();
        System.out.println("El mayor es " + calcularMayor(numero1,numero2));

        //EJERCICIO 9
        int numeroDNI;
        char letraDNI;
        String dniFinal;

        System.out.print("Numero DNI: ");
        numeroDNI = sc.nextInt();
        System.out.print("Letra DNI: ");
        letraDNI = sc.nextLine().charAt(0);

        dniFinal = formarDNI(numeroDNI, letraDNI);
        System.out.println(dniFinal);

        //EJERCICIO 10
        int diferente1 = 3;
        int diferente2 = 2;
        int diferente3 = 1;
        boolean diferencia;
        diferencia = sonDiferentes(diferente1, diferente2, diferente3);
        System.out.println(diferencia);

        //EJERCICIO 11
        int[] arrayNumero = {1,2,3,4,89,27};
        int mayor;

    }

    static void mostrarTextoMayusculas(String texto){

        System.out.println("EJERCICIO 1");
        /*
            Recibe un texto por parámetro. Lo convierte a mayúsculas. Lo muestra en pantalla
         */
        texto = texto.toUpperCase();
        System.out.println(texto);

    }
    static void mostrarValorAbsoluto(int numero){

        System.out.println("EJERCICIO 2");
        /*
        Recibe un número entero por parámetro (positivo o negativo).
            Lo convierte a positivo.
            Lo muestra en pantalla.
         */
        if (numero < 0){
            numero = numero * -1;
            System.out.println(numero);
        }
    }
    static void rellenarArray(int[] array){
        System.out.println("EJERCICIO 3");
        /*
            Recibe array de enteros.
            Lo rellena con números aleatorios.
         */

        Random rng = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rng.nextInt(101);
        }
        System.out.print(Arrays.toString(array));

    }
    /*
    EJERCICIO 4
    Según esto, ¿cuándo crees que se produce paso de parámetros por valor y cuándo por referencia en Java?
    No se
     */
    public static void mostrarMayor(int x, int y){
        System.out.println("EJERCICIO 5");
        /*
            Recibe dos números por parámetro.
            Muestra al mayor en pantalla.
         */
        if (x > y){
            System.out.println(x + " Es el mayor");
        }else if (y > x){
            System.out.println(y + " Es el mayor");
        }else {
            System.out.println("Los números son iguales");
        }
    }
    public static void mostrarDNI(int parteNumerica, char letra){
        /*
        EJERCICIO 6
            Recibe un número y una letra por parámetro, correspondientes a un DNI.
            Muestra en pantalla en pantalla el número, seguido de un guión y la letra convertida a mayúsculas.
         */

        System.out.println(parteNumerica+"-"+Character.toUpperCase(letra));
    }
    public static String convertirPrimeraLetraMayusculas(String texto){
        System.out.println("EJERCICIO 7");
        return texto.substring(0,1).toUpperCase()
                .concat(texto.substring(1).toLowerCase());
    }
    public static int calcularMayor(int x, int y) {
        if (x>y){
            return x;
        }
            return y;
    }
    public static String formarDNI(int parteNumerica, char letra) {

        String dni = parteNumerica + "-" + Character.toUpperCase(letra);
        return dni;

    }
    public static boolean sonDiferentes(int x, int y, int z){
        return  (x != y && x != z && y != z);
    }
    public static int buscarMayor(int[] array){
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor){
                mayor = array[i];
            }
            return  mayor;
        }
        return mayor;
    }
}
