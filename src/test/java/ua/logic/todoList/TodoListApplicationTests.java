package ua.logic.todoList;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ua.logic.todoList.model.Todo;
import ua.logic.todoList.repository.TodoRepository;
import ua.logic.todoList.service.TodoService;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@DataJpaTest
class TodoServiceTest  {
    @Mock
    private TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoService;

    public TodoServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetTodoById() {
        // Arrange
        long todoId = 1L;
        Todo todo = new Todo();
        todo.setId(todoId);
        todo.setTitle("Test Todo");
        todo.setDescription("This is a test todo");

        when(todoRepository.findById(todoId)).thenReturn(Optional.of(todo));

        // Act
        Optional<Todo> todoById = todoService.getTodoById(todoId);

        // Assert
        assertThat(todoById.get()).isEqualTo(todo);
        verify(todoRepository, times(1)).findById(todoId);
    }
}
