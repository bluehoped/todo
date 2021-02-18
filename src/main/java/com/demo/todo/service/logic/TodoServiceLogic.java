package com.demo.todo.service.logic;

import com.demo.todo.domain.TodoItem;
import com.demo.todo.service.TodoService;
import com.demo.todo.store.TodoStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceLogic implements TodoService {

    @Autowired
    private TodoStore store;

    @Override
    public TodoItem create(TodoItem item) {
        return store.create(item);
    }

    @Override
    public List<TodoItem> findAll() {
        return store.findAll();
    }

    @Override
    public TodoItem find(Long id) {
        return store.find(id);
    }

    @Override
    public TodoItem update(TodoItem item) {
        TodoItem todoItem = store.find(item.getId());
        if (todoItem == null) {
            throw new IllegalArgumentException("Please check todo item id");
        }

        todoItem.setTaskName(item.getTaskName());
        return store.update(todoItem);
    }

    @Override
    public TodoItem changeDoneState(Long id) {
        TodoItem todoItem = store.find(id);
        if (todoItem == null) {
            throw new IllegalArgumentException("id does not exist.");
        }

        todoItem.setDone(!todoItem.isDone());
        return store.update(todoItem);
    }

    @Override
    public void delete(Long id) {
        store.delete(id);
    }
}
