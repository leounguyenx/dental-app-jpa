package miu.cs525.dentalapp.repository;

import miu.cs525.dentalapp.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<Dentist, String> {
}
