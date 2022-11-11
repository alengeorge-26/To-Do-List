package project.todo.todolist.repositories;

import org.springframework.data.repository.CrudRepository;
import project.todo.todolist.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem,Long>
{

}
