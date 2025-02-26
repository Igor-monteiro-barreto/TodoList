package com.dev.IgorMonteiro.Todolist.Controller;

import com.dev.IgorMonteiro.Todolist.Model.Todo;
import com.dev.IgorMonteiro.Todolist.Service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")

public class TodoController {
    private final TodoService todoService;
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }
    //Criação de endinpoints
    @PostMapping("/create")
    List<Todo> create(@RequestBody @Valid Todo todo){
        return todoService.create(todo);
    }
    //TODO Depois vou testar colocar umas rotas aqui
    @GetMapping("/findAll")
    List<Todo> findAll(){
        return todoService.findAll();
    }
    @PutMapping("/update")
    List<Todo> update(@RequestBody @Valid Todo todo){
        return todoService.update(todo);
    }

    // Estará pronto na requisição quando você colocar na
    // localhost:8080/todo/1
    @DeleteMapping("/delete/{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
