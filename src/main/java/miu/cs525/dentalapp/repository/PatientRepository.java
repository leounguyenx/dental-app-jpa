package miu.cs525.dentalapp.repository;

import miu.cs525.dentalapp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String> {
}
