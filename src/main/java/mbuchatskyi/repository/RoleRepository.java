package mbuchatskyi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mbuchatskyi.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
