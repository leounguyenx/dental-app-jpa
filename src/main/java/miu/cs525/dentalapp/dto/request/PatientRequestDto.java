package miu.cs525.dentalapp.dto.request;

public record PatientRequestDto(
        String patientId,
        String firstName,
        String lastName,
        String email,
        String phone,
        AddressRequestDto addressRequestDto
) {
}
