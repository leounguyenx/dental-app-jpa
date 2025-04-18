package miu.cs525.dentalapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;
    private String appointmentDate;

    // An appointment has a surgery
    @ManyToOne
    @JoinColumn(name = "surgery_id")
    private Surgery surgery;

    //An appointment has a patient
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    // An appointment has a dentist
    @ManyToOne
    @JoinColumn(name = "dentist_id")
    private Dentist dentist;

    // An appointment has a request
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "request_id", unique = true, nullable = true)
    private Request request;

}
