package unidad1.monitoreo;

import java.util.Random;

public class Programa1 {
    /*Desarrolla un programa en Java que simule la lectura de tres sensores: temperatura, humedad y presencia.
    Los valores de estos sensores se generarán aleatoriamente. El programa detectará valores fuera de los umbrales
    normales y generará alarmas solo cuando un sensor acumule un número determinado de lecturas anómalas consecutivas.
    Además, mostrará estadísticas de las lecturas de cada sensor y el total de alarmas generadas.
     */

    static void main() {
        Random random = new Random();
        final int TMIN = 15, TMAX = 30, HMIN = 30, HMAX = 70, AUSENCIA = 0, PRESENCIA = 1;
        final int LECTURAS_ANOMALAS = 3, SENSIBILIDAD = 1000;

        int sensorT, sensorH, sensorP, lecturas;
        int contAnomaliasT, contAnomaliasH, contAnomaliasP;
        int alarmasT, alarmasH, alarmasP;
        int tMaxima, tMinima, hMaxima, hMinima, tSuma, hSuma;

        contAnomaliasT = contAnomaliasH = contAnomaliasP = 0;
        tSuma = hSuma = lecturas = 0;
        tMaxima = hMaxima = Integer.MIN_VALUE;
        tMinima = hMinima = Integer.MAX_VALUE;

        while (true) {

            //Generar lecturas sensores
            sensorT = random.nextInt(10, 41);
            sensorH = random.nextInt(20, 91);
            sensorP = random.nextInt(0, 2);

            //Contar lectura
            lecturas++;


            System.out.println("Kecruras actuales:");


        }


    }


}

}
