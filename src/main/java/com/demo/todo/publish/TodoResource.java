package com.demo.todo.publish;

import com.demo.todo.domain.TodoItem;
import com.demo.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoResource {

    @Autowired
    private TodoService service;

    @PostMapping
    public TodoItem create(@RequestBody TodoItem item) {
        return service.create(item);
    }

    @GetMapping
    public List<TodoItem> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public TodoItem find(@PathVariable Long id) {
        return service.find(id);
    }

    @PutMapping
    public TodoItem update(@RequestBody TodoItem item) {
        return service.update(item);
    }

    @PutMapping("/state/{id}")
    public TodoItem changeDoneState(@PathVariable Long id) {
        return service.changeDoneState(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
