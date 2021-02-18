package com.demo.todo.service;

import com.demo.todo.domain.TodoItem;

import java.util.List;

public interface TodoService {
    TodoItem create(TodoItem dto);

    List<TodoItem> findAll();

    TodoItem find(Long id);

    TodoItem update(TodoItem dto);

    TodoItem changeDoneState(Long id);

    void delete(Long id);
}
