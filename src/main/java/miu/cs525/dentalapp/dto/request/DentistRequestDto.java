package miu.cs525.dentalapp.dto.request;

public record DentistRequestDto(
        String firstName,
        String lastName,
        String email,
        String phone,
        String specialization
) {
}
