package org.example.cgn04spring_recapprojectsolution.todo;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {


    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAllTodos() {
        return todoRepository.findAll();
    }
}
