package mbuchatskyi.service;

import java.util.List;

import mbuchatskyi.model.User;

public interface UserService {
    User create(User user);
    User readById(long id);
    User update(User user);
    void delete(long id);
    List<User> getAll();

}
