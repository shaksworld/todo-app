package com.shaks.TodoDemo.service;

import com.shaks.TodoDemo.model.Todo;
import com.shaks.TodoDemo.payLoad.response.TodoRequest;

public interface ServiceTodo {
    Todo createTodo(TodoRequest todoRequest);

    Object getAllTodos();
}
