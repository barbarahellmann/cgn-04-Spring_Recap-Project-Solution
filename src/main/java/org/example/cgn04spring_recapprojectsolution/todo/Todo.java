package org.example.cgn04spring_recapprojectsolution.todo;

public record Todo(
        String id,
        String description,
        TodoStatus status

) {
}
