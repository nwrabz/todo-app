package org.wrabz.todo_app.services;

import org.springframework.stereotype.Service;
import org.wrabz.todo_app.model.Task;
import org.wrabz.todo_app.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return  taskRepository.findAll();
    }
}
