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
//            case 2:
//                revisarTarefa();
//                break;
//            case 3:
//                completarTarefa();
//                break;
                case 4:
                    listarTarefa(tareas, num_Tarea);
                    break;
//            case 5:
//                buscarTarefaDescripcion();
//                break;
//            case 6:
//                buscarTarefaUsuario();
//                break;
//            case 7:
//                resumoTarefa();
//                break;
//            case 0:
//                salirPrograma();
//                break;
            }
        }while (opcion != 0);
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
    static void listarTarefa(String[] tareas, int numTareas){
        System.out.println("\tLISTAR TAREFAS");
        System.out.println("-".repeat(25));

        for (int i = 0; i < numTareas; i++) {
            System.out.println(tareas[i]);
        }

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
