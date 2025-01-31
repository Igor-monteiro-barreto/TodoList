package com.dev.IgorMonteiro.Todolist.Service;

import com.dev.IgorMonteiro.Todolist.Model.Todo;
import com.dev.IgorMonteiro.Todolist.Repository.TodoRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    //Aqui é aonde se coloca todaas as operações que iremos fazer CRIAR ATUALIZAR DELETAR E CONSULTAR

    //Farei injeção atraves de atributo e não por anotação
    private final TodoRepository todosRepository;
    public TodoService(TodoRepository todosRepository){
        this.todosRepository = todosRepository;
    }
    @Transactional
    public void deleteAll() {
        todosRepository.deleteAll();
    }
    public List<Todo> create(Todo todo){
        todosRepository.save(todo);
        return findAll();
    }
    public List<Todo> findAll(){
        Sort sort = Sort.by("prioridade").descending().
        and(Sort.by("name").ascending());
        return todosRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo){
        todosRepository.save(todo);
        return findAll();
    }
    public List<Todo> delete(long id){
        todosRepository.deleteById(id);
        return findAll();
    }
}
