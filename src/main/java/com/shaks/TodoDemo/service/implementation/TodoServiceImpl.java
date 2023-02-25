package com.shaks.TodoDemo.service.implementation;

import com.shaks.TodoDemo.model.Todo;
import com.shaks.TodoDemo.payLoad.response.TodoRequest;
import com.shaks.TodoDemo.repository.TodoController;
import com.shaks.TodoDemo.service.ServiceTodo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TodoServiceImpl implements ServiceTodo {

    private final TodoController todoController;
    @Override
    public Todo createTodo(TodoRequest todoRequest) {
        Todo todo = new Todo();
        todo.setTitle(todoRequest.getTitle());
        todo.setDescription(todoRequest.getDescription());
        todo.setStatus(todoRequest.getStatus());


        return todoController.save(todo);
    }

    @Override
    public Object getAllTodos() {
        if (todoController.findAll().isEmpty()){
            return "No todos found";
        }
        return todoController.findAll();

    }

    private String validationStatus(String status){
        switch (status){
            case "completed":
                return "completed";
            case "in-progress":
                return "in-progress";
            case "not-started":
                return "not-started";
            default:
                return "not-started";
        }
    }
}
