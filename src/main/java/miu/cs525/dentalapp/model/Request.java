package miu.cs525.dentalapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;
    private String requestDate;

    public Request(String requestDate, Patient patient) {
        this.requestDate = requestDate;
        this.patient = patient;
    }

    // Many requests have a patient
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;


}
