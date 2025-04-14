package miu.cs525.dentalapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "surgeries")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String surgeryId;
    private String surgeryName;
    private String phoneNumber;

    // A surgery has an address
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", unique = true, nullable = true)
    private Address address;

    // A surgery has many appointments
    @OneToMany(mappedBy = "surgeryId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Appointment> appointments;

    public Surgery(String surgeryName, String phoneNumber, Address address) {
        this.surgeryName = surgeryName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Surgery(String surgeryId) {
    }
}
