package miu.cs525.dentalapp.repository;

import miu.cs525.dentalapp.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryRepository extends JpaRepository<Surgery, String> {
}
