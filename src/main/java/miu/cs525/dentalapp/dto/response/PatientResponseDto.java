package miu.cs525.dentalapp.dto.response;

public record PatientResponseDto(
        String patientId,
        String firstName,
        String lastName,
        String email,
        String phone,
        String dob,
        miu.cs525.dentalapp.model.Address address
) {
}
