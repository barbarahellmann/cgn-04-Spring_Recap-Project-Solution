package org.example.cgn04spring_recapprojectsolution.todo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class TodoServiceTest {

    TodoRepository todoRepository =  mock(TodoRepository.class);
    TodoService todoService = new TodoService(todoRepository);

    @Test
    void findAllTodos() {
        //GIVEN
        Todo t1 = new Todo("1");
        Todo t2 = new Todo("2");
        Todo t3 = new Todo("3");
        List<Todo> todos = List.of(t1,t2,t3);

        when(todoRepository.findAll()).thenReturn(todos);

        //WHEN
        List<Todo> actual =  todoService.findAllTodos();

        //THEN
        verify(todoRepository).findAll();
        assertEquals(todos, actual);
    }
}