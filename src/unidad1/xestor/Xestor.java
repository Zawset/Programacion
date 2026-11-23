package unidad1.xestor;

import java.util.Scanner;

public class Xestor {

    static Scanner sc = new Scanner(System.in);
    static final int MAX_TAREAS = 10;

    public static void main(String[] args) {

        String[] tareas = new String[MAX_TAREAS];
        int num_Tarea = 0;
        int opcion;
        do {

            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    if (engadirTarefa(tareas, num_Tarea)) num_Tarea++;
                    break;
                case 2:
                    revisarTarefa(tareas, num_Tarea);
                    break;
                case 3:
                    completarTarea(tareas, num_Tarea);
                    break;
                case 4:
                    listarTarefa(tareas, num_Tarea);
                    break;
                case 5:
                    buscarTarefaDescripcion(tareas, num_Tarea);
                    break;
                case 6:
                    buscarTarefaUsuario(tareas, num_Tarea);
                    break;
                case 7:
                  resumoTarefa(tareas, num_Tarea);
                  break;
                case 0:
                  break;
            }
        } while (opcion != 0);
    }

    static int mostrarMenu() {
        int opcion;

        System.out.println("Xestor de Tarefas de Mantemento Informático");
        System.out.println("-".repeat(50));
        System.out.println("\t1. Engadir nova tarefa");
        System.out.println("\t2. Revisar tarefa");
        System.out.println("\t3. Completar tarefa");
        System.out.println("\t4. Listar tarefas");
        System.out.println("\t5. Buscar tarefa por descrición");
        System.out.println("\t6. Filtrar tarefas por usuario");
        System.out.println("\t7. Resumo");
        System.out.println();
        System.out.println("\t0. SAÍR");
        System.out.println();
        do {
            System.out.print("Que opción va a realizar: ");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion < 0 || opcion > 7) {
                System.out.println("No se puede encontrar la opción, introduzca una opción válida");
            }
        } while (opcion < 0 || opcion > 7);
        return opcion;
    }

    static boolean engadirTarefa(String[] tareas, int numTarefa) {

        if (numTarefa >= MAX_TAREAS) {
            System.out.println("Memoria llena, finaliza una tarea para poder añadir otra");
            return false;
        }

        String descripcion, usuario, tarefa;

        System.out.println("ENGADIR TAREFA");
        System.out.println("-".repeat(25));
        System.out.print("\tDescripción: ");
        descripcion = sc.nextLine();
        System.out.print("\tUsuario: ");
        usuario = sc.nextLine();

        descripcion = tipoOracion(descripcion);
        usuario = convertirCamelCase(usuario);

        tarefa = descripcion
                .concat(" | Solicitada por: ")
                .concat(usuario)
                .concat(" | Estado: PENDENTE")
                .concat(" | Responsable: Ninguén");

        System.out.println(tarefa);

        tareas[numTarefa] = tarefa;
        return true;
    }

    static void revisarTarefa(String[] tareas, int numTareas) {
        int n;
        String responsable;
        String[] partes;
        listarTarefa(tareas, numTareas);
        System.out.print("\nResponsable de la revisión: ");
        responsable = sc.nextLine();
        responsable = convertirCamelCase(responsable);
        System.out.print("\nQue tarefa queres revisar (Ponga el numero correspondiente): ");
        do {
            n = sc.nextInt();
            sc.nextLine();
        } while (n > tareas.length || n <= 0);
        partes = tareas[n - 1].split("\\|");

        tareas[n - 1] = partes[0].concat(" | ")
                .concat(partes[1])
                .concat("| Estado: EN REVISIÓN | ")
                .concat("Responsable: ")
                .concat(responsable);

        System.out.println("Tarefa revisada");

    }

    static void completarTarea(String[] tareas, int numTareas) {
        String[] partes;
        String responsable;
        int n;

        listarTarefa(tareas, numTareas);
        do {
            System.out.print("Que tarea quieres completar? ");
            n = sc.nextInt();
            sc.nextLine();
        } while (n <= 0 || n > numTareas);
        n--;

        System.out.print("Responsable? ");
        responsable = sc.nextLine();
        partes = tareas[n].split("\\|");
        tareas[n] = partes[0].concat("|")
                .concat(partes[1])
                .concat("| Estado: COMPLETADA | ")
                .concat("Responsable: ")
                .concat(convertirCamelCase(responsable));

        System.out.println("\nTarea revisada....\n");
    }
    static void buscarTarefaDescripcion(String[] tareas, int numTareas) {
        String descripcion;
        System.out.print("\nQue usuario buscas: ");
        descripcion = sc.nextLine();
        descripcion = tipoOracion(descripcion);
        for (int i = 0; i < numTareas; i++) {
            if (tareas[i].contains(descripcion)){
                System.out.println((i+1) + ". " +tareas[i]);
            }
        }
        System.out.println();
    }

    static void buscarTarefaUsuario(String[] tareas, int numTareas) {
        String usuario;
        System.out.print("\nQue usuario buscas: ");
        usuario = sc.nextLine();
        usuario = convertirCamelCase(usuario);
        for (int i = 0; i < numTareas; i++) {
            if (tareas[i].contains(usuario)){
                System.out.println((i+1) + ". " +tareas[i]);
            }
        }
        System.out.println();
    }

    static void listarTarefa(String[] tareas, int numTareas) {
        System.out.println("\tLISTAR TAREFAS");
        System.out.println("-".repeat(25));

        for (int i = 0; i < numTareas; i++) {
            System.out.println((i + 1) + ". " + tareas[i]);
        }

    }
    static void resumoTarefa(String[] tareas, int numTareas){
        int pendientes = 0, revision = 0, completadas = 0;

        for (int i = 0; i < numTareas; i++) {
            if (tareas[i].contains("PENDENTE")){
                pendientes++;
            }else if (tareas[i].contains("EN REVISIÓN")){
                revision++;
            }else if (tareas[i].contains("COMPLETADA")){
                completadas++;
            }
        }
        System.out.println("Total de tareas: " + numTareas);
        System.out.println("Pendientes: " + pendientes);
        System.out.println("En revisión: " + revision);
        System.out.println("Completadas: " + completadas);
        System.out.println();
    }

    static String convertirCamelCase(String txt) {
        String[] partes = txt.split("\\s+");
        String formateado = "";
        for (String p : partes) {
            formateado = formateado.concat(p.substring(0, 1).toUpperCase().concat(p.substring(1).toLowerCase())
                    .concat(" "));
        }
        return formateado.trim();
    }

    static String tipoOracion(String txt) {
        txt = txt.substring(0, 1).toUpperCase().concat(txt.substring(1).toLowerCase());
        return txt;
    }
}
