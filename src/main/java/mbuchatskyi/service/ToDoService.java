package mbuchatskyi.service;

import java.util.List;

import mbuchatskyi.model.ToDo;

public interface ToDoService {
    ToDo create(ToDo todo);
    ToDo readById(long id);
    ToDo update(ToDo todo);
    void delete(long id);

    List<ToDo> getAll();
    List<ToDo> getByUserId(long userId);
}
