package unidad1.array;

import java.lang.reflect.Array;

public class Ejercicio2 {
    static void main() {
        String[] simbolos = new String[10];

        simbolos[0]= "a";
        simbolos[1]= "x";
        simbolos[4]= "@";
        simbolos[6]= " ";
        simbolos[7]= "+";
        simbolos[8]= "Q";
        for (int i = 0; i < simbolos.length; i++) {
            System.out.println(simbolos[i]);
        }
    }
}
