package unidad1.array;

import java.util.Scanner;

public class Ejercicio16 {
    static void main() {
        /*Crea un programa que lea por teclado un DNI, calcule y muestre en pantalla la letra que le corresponde.
        Para calcular la letra del DNI, debemos dividir el número entre 23 y quedarnos con el resto. El resto,
        que estará entre 0 y 22, está asociado a una letra según la siguiente tabla. Puedes emplear un array
        para guardar las letras del DNI.
         */
        String[] letras = {"T","R","W","A","G","M","Y","F","P",
                "D","X","B","N","J","Z","S","Q","V","H","L","C",
                "K","E"};
        Scanner sc= new Scanner(System.in);
        int num;
        int resto;
        System.out.print("Escribeme los números de tu DNI: ");
        num= sc.nextInt();
        resto =num%23;
        System.out.println("Tu DNI es: " + num + letras[resto]);
    }
}
