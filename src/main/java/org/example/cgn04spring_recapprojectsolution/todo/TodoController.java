package org.example.cgn04spring_recapprojectsolution.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.findAllTodos();
    }

    @PostMapping
    public Todo postTodo(@RequestBody NewTodo newTodo) {
        return todoService.addTodo(newTodo);
    }

    @PutMapping("{id}")
    public Todo putTodo(@RequestBody UpdateTodo todo, @PathVariable String id) {
        return todoService.updateTodo(todo, id);

    }

    @GetMapping("{id}")
    public Todo getTodoById(@PathVariable String id) {
        return todoService.findTodoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable String id) {
        todoService.deleteTodo(id);
    }
}
