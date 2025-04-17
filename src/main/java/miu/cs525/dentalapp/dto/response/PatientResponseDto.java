package miu.cs525.dentalapp.dto.response;

import miu.cs525.dentalapp.model.Address;

public record PatientResponseDto(
        String patientId,
        String firstName,
        String lastName,
        String email,
        String phone,
        String dob,
        Address address
) {
}
