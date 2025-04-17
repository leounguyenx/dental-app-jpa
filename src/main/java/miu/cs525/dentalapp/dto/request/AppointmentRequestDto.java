package miu.cs525.dentalapp.dto.request;

public record AppointmentRequestDto(
        String appointmentDate,
        String requestId,
        String surgeryId,
        String dentistId,
        String patientId
) {
}
