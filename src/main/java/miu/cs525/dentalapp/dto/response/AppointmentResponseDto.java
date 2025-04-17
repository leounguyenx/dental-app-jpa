package miu.cs525.dentalapp.dto.response;

public record AppointmentResponseDto(
        String appointmentDate,
        String surgeryId,
        String dentistId,
        String patientId
) {
}
