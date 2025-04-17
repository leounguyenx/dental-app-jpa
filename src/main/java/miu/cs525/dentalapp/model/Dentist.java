package miu.cs525.dentalapp.model;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dentistId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String specialization;

//    // A dentist has many appointments
//    @OneToMany(mappedBy = "dentist", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Appointment> appointments;

    public Dentist(String firstName, String lastName, String email, String phone, String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.specialization = specialization;
    }

    public Dentist(String dentistName) {
    }
}
