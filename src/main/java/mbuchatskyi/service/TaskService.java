package mbuchatskyi.service;

import java.util.List;

import mbuchatskyi.model.Task;

public interface TaskService {
    Task create(Task task);
    Task readById(long id);
    Task update(Task task);
    void delete(long id);

    List<Task> getAll();
    List<Task> getByTodoId(long todoId);
}
