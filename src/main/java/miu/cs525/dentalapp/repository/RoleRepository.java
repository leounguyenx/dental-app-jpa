package miu.cs525.dentalapp.repository;

import miu.cs525.dentalapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
