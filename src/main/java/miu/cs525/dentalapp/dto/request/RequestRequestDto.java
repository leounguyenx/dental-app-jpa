package miu.cs525.dentalapp.dto.request;

public record RequestRequestDto(
        String requestDate,
        PatientRequestDto patientRequestDto
) {
}
