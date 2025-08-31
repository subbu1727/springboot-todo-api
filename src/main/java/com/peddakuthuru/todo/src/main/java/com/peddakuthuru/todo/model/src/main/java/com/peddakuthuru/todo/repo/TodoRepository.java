package com.peddakuthuru.todo.repo;

import com.peddakuthuru.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
