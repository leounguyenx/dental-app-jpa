package miu.cs525.dentalapp.dto.response;

public record RequestResponseDto(
        String requestDate,
        PatientResponseDto patientResponseDto
) {
}
