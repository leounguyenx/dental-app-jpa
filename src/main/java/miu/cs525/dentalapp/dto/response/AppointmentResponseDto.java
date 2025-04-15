package miu.cs525.dentalapp.dto.response;

import miu.cs525.dentalapp.dto.request.DentistRequestDto;
import miu.cs525.dentalapp.dto.request.PatientRequestDto;
import miu.cs525.dentalapp.dto.request.SurgeryRequestDto;

public record AppointmentResponseDto(
        Long appointmentId,
        String appointmentDate,
        SurgeryRequestDto surgeryRequestDto,
        PatientRequestDto patientRequestDto,
        DentistRequestDto dentistRequestDto
) {
}
