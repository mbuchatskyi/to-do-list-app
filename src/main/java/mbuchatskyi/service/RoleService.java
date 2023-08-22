package mbuchatskyi.service;

import java.util.List;

import mbuchatskyi.model.Role;

public interface RoleService {
    Role create(Role role);
    Role readById(long id);
    Role update(Role role);
    void delete(long id);
    List<Role> getAll();
}
