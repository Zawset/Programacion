package unidad1.monitoreo;

import java.util.Random;

public class Programa1 {
    /*Desarrolla un programa en Java que simule la lectura de tres sensores: temperatura, humedad y presencia.
    Los valores de estos sensores se generarán aleatoriamente. El programa detectará valores fuera de los umbrales
    normales y generará alarmas solo cuando un sensor acumule un número determinado de lecturas anómalas consecutivas.
    Además, mostrará estadísticas de las lecturas de cada sensor y el total de alarmas generadas.
     */

    static void main() throws InterruptedException {
        Random random = new Random();
        final int TMIN = 15, TMAX = 30, HMIN = 30, HMAX = 70, AUSENCIA = 0, PRESENCIA = 1;
        final int LECTURAS_ANOMALAS = 3, SENSIBILIDAD = 5000;

        String presencia;
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
            lecturas++;

            sensorT = random.nextInt(10, 41);
            tSuma += sensorT;
            sensorH = random.nextInt(20, 91);
            hSuma += sensorH;
            sensorP = random.nextInt(0, 2);


            System.out.println("Lecturas actuales:");
            presencia = (sensorP == 1) ? "SI" : "NO";
            System.out.println("\t- Temperatura: " + sensorT + "ºC");
            System.out.println("\t- Humedad: " + sensorH + "%");
            System.out.println("\t- Presencia: " + presencia);

            //Calcular estadísticas
            if (sensorT > tMaxima) tMaxima = sensorT;
            if (sensorT < tMinima) tMinima = sensorT;
            if (sensorH > hMaxima) hMaxima = sensorH;
            if (sensorH < hMinima) hMinima = sensorH;

            //Anomalias
            if (sensorT < TMIN || sensorT > TMAX){
                contAnomaliasT++;
            }else contAnomaliasT = 0;
            if (sensorH < HMIN || sensorH > HMAX){
                contAnomaliasH++;
            }else contAnomaliasH = 0;
            if (sensorP == PRESENCIA){
                contAnomaliasP++;
            }else contAnomaliasP = 0;

            //Alarmas
            if (contAnomaliasT >=LECTURAS_ANOMALAS) System.out.println("¡ALARMA EN SENSOR DE TEMPERATURA!");
            if (contAnomaliasH >=LECTURAS_ANOMALAS) System.out.println("¡ALARMA EN SENSOR DE HUMEDAD!");
            if (contAnomaliasP >=LECTURAS_ANOMALAS) System.out.println("¡ALARMA EN SENSOR DE PRESENCIA!");

            //Estadísticas
            System.out.println("Estadísticas");
            System.out.println("\t- Temperatura Máxima " + tMaxima + "ºC, Mínima " + tMinima + "ºC, promedio de Temperatura: " + tSuma / lecturas + "ºC");
            System.out.println("\t- Humedad Máxima " + hMaxima + "%, Mínima " + hMinima + "%, promedio de Humedad: " + hSuma / lecturas + "%");
            //Espera
            Thread.sleep(SENSIBILIDAD);
            System.out.println("---------------------");
            System.out.println();
            System.out.println("---------------------");

        }


    }


}
