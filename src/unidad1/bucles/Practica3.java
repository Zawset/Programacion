package unidad1.bucles;

public class Practica3 {
    //Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 5 ==0){
                System.out.println(i);
            }
            i++;
        }while (i<=100);
    }

}
