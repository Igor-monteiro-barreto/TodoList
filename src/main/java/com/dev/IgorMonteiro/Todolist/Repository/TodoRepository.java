package com.dev.IgorMonteiro.Todolist.Repository;

import com.dev.IgorMonteiro.Todolist.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
