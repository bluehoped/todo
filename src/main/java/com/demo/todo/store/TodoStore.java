package com.demo.todo.store;


import com.demo.todo.domain.TodoItem;

import java.util.List;

public interface TodoStore {
    TodoItem create(TodoItem item);

    List<TodoItem> findAll();

    TodoItem find(Long id);

    TodoItem update(TodoItem item);

    void delete(Long id);
}
