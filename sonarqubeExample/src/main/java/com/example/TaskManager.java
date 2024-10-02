package com.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Tarea añadida: " + task.getName());
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }
        System.out.println("Lista de Tareas:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i).getName());
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Tarea eliminada: " + tasks.get(index).getName());
            tasks.remove(index);
        } else {
            System.out.println("Índice no válido.");
        }
    }
}
