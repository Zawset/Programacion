package unidad1.bucles;

public class Practica12 {
    /*
    Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
     */
    public static void main(String[] args) {
        int divisiones;
        int cont;
        for (int i = 2; i < 101; i++) {
            divisiones = 0;
            cont = 2; //Saltamos el 1 para que la división no sume al contador de división
            while (cont < i) { //Cerramos antes de i para que no cuente la división entre si mismo
                if (i % cont == 0) {
                    divisiones++;
                }
                cont++;
            }
            if (divisiones == 0){  //Ahora el contador de divisiones se puede poner que compruebe que no hubo divisiones en vez de 2
                System.out.println(i);
            }
        }
    }
}
