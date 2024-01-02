package com.example.todo.controller;

import com.example.todo.model.Task;
import com.example.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") // Allows all origins
@RestController
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @PostMapping("/add")
    public void addTask(@RequestBody Task task) {
        repository.save(task);
    }
}
