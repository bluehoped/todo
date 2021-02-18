package com.demo.todo.store.jpa.repository;


import com.demo.todo.domain.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoItem, Long> {
}
