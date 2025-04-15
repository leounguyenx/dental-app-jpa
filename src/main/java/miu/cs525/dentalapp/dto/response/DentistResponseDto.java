package miu.cs525.dentalapp.dto.response;

public record DentistResponseDto(
        String dentistId,
        String firstName,
        String lastName,
        String email,
        String phone,
        String specialization
) {
}
