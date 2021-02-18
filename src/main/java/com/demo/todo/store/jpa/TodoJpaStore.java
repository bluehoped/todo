package com.demo.todo.store.jpa;


import com.demo.todo.domain.TodoItem;
import com.demo.todo.store.TodoStore;
import com.demo.todo.store.jpa.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoJpaStore implements TodoStore {

    @Autowired
    private TodoRepository repository;

    @Override
    public TodoItem create(TodoItem item) {
        return repository.save(item);
    }

    @Override
    public List<TodoItem> findAll() {
        return repository.findAll();
    }

    @Override
    public TodoItem find(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public TodoItem update(TodoItem item) {
        return repository.save(item);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
