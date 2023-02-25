package com.shaks.TodoDemo.repository;

import com.shaks.TodoDemo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoController extends JpaRepository<Todo, Long> {
}
