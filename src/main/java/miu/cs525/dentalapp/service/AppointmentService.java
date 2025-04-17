package miu.cs525.dentalapp.service;

import miu.cs525.dentalapp.dto.request.AppointmentRequestDto;
import miu.cs525.dentalapp.dto.response.AppointmentResponseDto;

public interface AppointmentService {
    AppointmentResponseDto addNewAppointment(AppointmentRequestDto appointmentRequestDto);
}
