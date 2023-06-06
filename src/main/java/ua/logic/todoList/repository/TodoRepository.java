package ua.logic.todoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.logic.todoList.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
