package unidad1.notas;

public class GestionNotas {

    public static void main(String[] args) {

        String[] nombres = {
                "Ana", "Carlos", "Lucia", "Pedro",
                "Marta", "David", "Elena", "Pablo"
        };

        double[] notas = {
                7.5, 4.2, 8.8, 5.5, 3.7, 6.0, 9.2, 4.8
        };
/*
        // 1. Mostrar todos los alumnos
        System.out.println("=== LISTADO DE ALUMNOS ===");
        //mostrarAlumnos(nombres, notas);

        // 2. Mostrar los alumnos aprobados
        System.out.println("\n=== ALUMNOS APROBADOS ===");
        mostrarAprobados(nombres, notas);

        // 3. Mostrar los alumnos suspensos
        System.out.println("\n=== ALUMNOS SUSPENSOS ===");
        mostrarSuspensos(nombres, notas);
*/
        // Mejora 1-3
        System.out.println("\n=== LISTADO DE ALUMNOS ===");
        mostrarAlumnos(nombres, notas, 0, 10);

        System.out.println("\n=== ALUMNOS APROBADOS ===");
        mostrarAlumnos(nombres, notas, 5, 10);

        System.out.println("\n=== ALUMNOS SUSPENSOS ===");
        mostrarAlumnos(nombres, notas, 0, 4.99);


        // 4. Calcular la nota media
        System.out.println("\n=== NOTA MEDIA ===");
        System.out.println(calcularMedia(notas));

        // 5. Obtener la nota máxima
        System.out.println("\n=== NOTA MÁXIMA ===");
        System.out.println(obtenerMaxima(notas));

        // 6. Contar los alumnos aprobados
        System.out.println("\n=== NÚMERO DE APROBADOS ===");
        System.out.println(contarAprobados(notas));

        // 7. Comprobar si todos han aprobado
        System.out.println("\n=== TODOS HAN APROBADO ===");
        System.out.println(todosAprobados(notas));

        // 8. Buscar un alumno
        System.out.println("\n=== BUSCAR ALUMNO ===");
        int posicion = buscarAlumno(nombres, "Carlos");
        if (posicion != -1) {
            System.out.println("Carlos está en la posición " + posicion);
        } else {
            System.out.println("Alumno no encontrado");
        }

        // 9. Consultar la nota de un alumno
        System.out.println("\n=== CONSULTAR NOTA ===");
        double nota = consultarNota(nombres, notas, "Lucia");

        if (nota != -1) {
            System.out.println("Nota de Lucia: " + nota);
        } else {
            System.out.println("Alumno no encontrado");
        }

        // 10. Modificar la nota de un alumno
        System.out.println("\n=== MODIFICAR NOTA ===");
        boolean modificada = modificarNota(nombres, notas, "Pablo", 6.5);

        if (modificada) {
            System.out.println("Nota modificada correctamente");
        } else {
            System.out.println("No se ha podido modificar la nota");
        }

        // 11. Incrementar todas las notas
        System.out.println("\n=== LISTADO DESPUÉS DEL INCREMENTO ===");
        incrementarNotas(notas, 0.5);
        mostrarAlumnos(nombres, notas, 0, 10);

        // 12. Calcular el porcentaje de aprobados
        System.out.println("\n=== PORCENTAJE DE APROBADOS ===");
        System.out.println(porcentajeAprobados(notas) + "%");

        // 13. Contar las notas superiores a 7
        System.out.println("\n=== NOTAS SUPERIORES A 7 ===");
        System.out.println(contarSuperiores(notas, 7));

        // 14. Obtener la nota de una posición
        System.out.println("\n=== CONSULTAR NOTA POR POSICIÓN ===");
        System.out.println(obtenerNota(notas, 3));

    }

    // IMPLEMENTA AQUÍ LOS MÉTODOS NECESARIOS

    //EJERCICIO 1
    static void mostrarAlumnos(String[] alumnos, double[] notas, double minima, double maxima) {
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] >= minima && notas[i] <= maxima) {
                System.out.println(alumnos[i] + ": " + notas[i]);
            }
        }
    }

    //EJERCICIO 2
    static void mostrarAprobados(String[] alumnos, double[] notas) {
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(alumnos[i] + ": " + notas[i]);
            }
        }
    }

    //EJERCICIO 3
    static void mostrarSuspensos(String[] alumnos, double[] notas) {
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] < 5) {
                System.out.println(alumnos[i] + ": " + notas[i]);
            }
        }
    }

    //EJERCICIO 4
    static double calcularMedia(double[] notas) {
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        return total / notas.length;
    }

    //EJERCICIO 5
    static double obtenerMaxima(double[] notas) {
        double maxima = Integer.MIN_VALUE;
        for (double nota : notas) {
            if (nota > maxima) {
                maxima = nota;
            }
        }
        return maxima;
    }

    //EJERCICIO 6
    static int contarAprobados(double[] notas) {
        int cont = 0;
        for (double nota : notas) {
            if (nota >= 5) {
                cont++;
            }
        }
        return cont;
    }

    //EJERCICIO 7
    static boolean todosAprobados(double[] notas) {
        int cont = 0;
        while (cont < notas.length && notas[cont] >= 5){
                cont++;
        }
        return cont >= notas.length;
    }

    //EJERCICIO 8
    static int buscarAlumno(String[] alumnos, String objetivo){
        int i = 0;
        while (i < alumnos.length && !alumnos[i].equalsIgnoreCase(objetivo)) {
            i++;
        }
        if (i < alumnos.length) {
            return i;
        }
        return -1;
    }

    //EJERCICIO 9
    static double consultarNota(String[] alumnos, double[] notas, String objetivo){
        int i = 0;
        i = buscarAlumno(alumnos, objetivo);
        if (i != -1){
            return notas[i];
        }
        return -1;
    }

    //EJERCICIO 10
    static boolean modificarNota(String[] alumnos, double[] notas, String objetivo, double notaNueva){
        int pos = 0;
        pos = buscarAlumno(alumnos, objetivo);
        if (pos != -1) {
            notas[pos] = notaNueva;
            return true;
        }
        return false;
    }

    //EJERCICIO 11
    static void incrementarNotas(double[] notas, double incremento){
        for (int i = 0; i < notas.length; i++) {
            notas[i] += incremento;
            if (notas[i] > 10){
                notas[i] = 10;
            }
        }
    }

    //EJERCICIO 12
    static double porcentajeAprobados(double[] notas) {
            return (double) contarAprobados(notas) / notas.length * 100;
    }

    //EJERCICIO 13
    static int contarSuperiores(double[] notas, int minima){
        int cont = 0;
        for (double nota : notas) {
            if (nota >= minima) {
                cont++;
            }
        }
        return cont;
    }

    //EJERCICIO 14
    static String obtenerNota(double[] notas, int posicion){
        return "La nota en la posición " + posicion + " es: " + notas[posicion];
    }
}
