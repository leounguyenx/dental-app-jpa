package miu.cs525.dentalapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dentists")
public class Dentist {
    @Id
    private String dentistId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String specialization;
}
