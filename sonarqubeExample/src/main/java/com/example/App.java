package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Bienvenido al Gestor de Tareas");
        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Introduce una opción: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Introduce el nombre de la tarea: ");
                    String taskName = scanner.nextLine();
                    taskManager.addTask(new Task(taskName));
                    break;
                case "2":
                    taskManager.listTasks();
                    break;
                case "3":
                    System.out.print("Introduce el índice de la tarea a eliminar: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    taskManager.removeTask(index);
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!command.equals("4"));
        scanner.close();
    }
}
