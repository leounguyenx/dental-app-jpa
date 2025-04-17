package miu.cs525.dentalapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String requestId;
    private String requestDate;
    private String patientId;

    public Request(String requestDate, String patientId) {
        this.requestDate = requestDate;
        this.patientId = patientId;
    }

    // Many requests have a patient
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
