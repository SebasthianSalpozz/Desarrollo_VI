package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for TaskManager.
 */
public class TaskManagerTest extends TestCase {
    private TaskManager taskManager;

    public TaskManagerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TaskManagerTest.class);
    }

    @Override
    protected void setUp() {
        taskManager = new TaskManager();
    }

    public void testAddTask() {
        taskManager.addTask(new Task("Tarea 1"));
        assertEquals(1, taskManager.tasks.size());
    }

    public void testRemoveTask() {
        taskManager.addTask(new Task("Tarea 1"));
        taskManager.removeTask(0);
        assertEquals(0, taskManager.tasks.size());
    }

    public void testRemoveTaskInvalidIndex() {
        taskManager.addTask(new Task("Tarea 1"));
        taskManager.removeTask(1); // Invalid index
        assertEquals(1, taskManager.tasks.size()); // Should still be 1
    }
}
