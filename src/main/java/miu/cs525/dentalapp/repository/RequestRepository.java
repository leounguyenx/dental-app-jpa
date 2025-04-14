package miu.cs525.dentalapp.repository;

import miu.cs525.dentalapp.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
