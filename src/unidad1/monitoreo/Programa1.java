package unidad1.monitoreo;

import java.util.Random;

public class Programa1 {
    /*Desarrolla un programa en Java que simule la lectura de tres sensores: temperatura, humedad y presencia.
    Los valores de estos sensores se generarán aleatoriamente. El programa detectará valores fuera de los umbrales
    normales y generará alarmas solo cuando un sensor acumule un número determinado de lecturas anómalas consecutivas.
    Además, mostrará estadísticas de las lecturas de cada sensor y el total de alarmas generadas.
     */

    static void main() {
        Random random= new Random();

        int MAX_TEMP = 50;
        int MAX_HUM = 70;
        int temperatura, humedad, errores;
        int tError = 0, hError = 0, pError = 0;
        boolean presencia = false;

        while (tError != 3 && hError != 3 && pError !=3){
            temperatura = random.nextInt(75);
            humedad = random.nextInt(101);
            presencia = random.nextBoolean();
            if (temperatura > MAX_TEMP){
                tError ++;
            }


        }


    }

}
