package com.dev.IgorMonteiro.Todolist.Controller;

import com.dev.IgorMonteiro.Todolist.Model.Todo;
import com.dev.IgorMonteiro.Todolist.Service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")

public class TodoController {
    private TodoService todoService;
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }
    //Criação de endinpoints
    @PostMapping
    List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
    }
    //TODO Depois vou testar colocar umas rotas aqui
    @GetMapping
    List<Todo> findAll(){
        return todoService.findAll();
    }
    @PutMapping
    List<Todo> update(Todo todo){
        return todoService.updade(todo);
    }

    // Estará pronto na requisição quando você colocar na
    // localhost:8080/todo/1
    @DeleteMapping("/{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
