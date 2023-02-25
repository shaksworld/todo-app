package com.shaks.TodoDemo.controller;

import com.shaks.TodoDemo.model.Todo;
import com.shaks.TodoDemo.payLoad.response.TodoRequest;
import com.shaks.TodoDemo.service.ServiceTodo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/todo")
@RestController
public class TodoController {

    private  final ServiceTodo serviceTodo;

    @PostMapping("/todos")
    public ResponseEntity<?> createTodo(@RequestBody TodoRequest todoRequest) {
        Todo todoResponse = serviceTodo.createTodo(todoRequest);
        return new ResponseEntity<>(todoResponse, HttpStatus.OK);
    }

    @GetMapping("/todos")
    public ResponseEntity<?> getAllTodos(@RequestBody TodoRequest todoRequest) {
        Todo todoResponse = serviceTodo.createTodo(todoRequest);
        return new ResponseEntity<>(serviceTodo.getAllTodos(), HttpStatus.OK);
    }
}
