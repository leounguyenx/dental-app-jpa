package miu.cs525.dentalapp.repository;

import miu.cs525.dentalapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
