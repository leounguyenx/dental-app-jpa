package miu.cs525.dentalapp.dto.request;

public record AppointmentRequestDto(
        String appointmentDate,
        SurgeryRequestDto surgeryRequestDto,
        PatientRequestDto patientRequestDto,
        DentistRequestDto dentistRequestDto
) {
}
