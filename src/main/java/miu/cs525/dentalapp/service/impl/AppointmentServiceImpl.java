package miu.cs525.dentalapp.service.impl;

import lombok.RequiredArgsConstructor;
import miu.cs525.dentalapp.dto.request.AppointmentRequestDto;
import miu.cs525.dentalapp.dto.response.AppointmentResponseDto;
import miu.cs525.dentalapp.model.Appointment;
import miu.cs525.dentalapp.model.Dentist;
import miu.cs525.dentalapp.model.Patient;
import miu.cs525.dentalapp.model.Surgery;
import miu.cs525.dentalapp.repository.AppointmentRepository;
import miu.cs525.dentalapp.repository.DentistRepository;
import miu.cs525.dentalapp.repository.PatientRepository;
import miu.cs525.dentalapp.repository.SurgeryRepository;
import miu.cs525.dentalapp.service.AppointmentService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    AppointmentRepository appointmentRepository;
    DentistRepository dentistRepository;
    PatientRepository patientRepository;
    SurgeryRepository surgeryRepository;

    @Override
    public AppointmentResponseDto addNewAppointment(AppointmentRequestDto appointmentRequestDto) {
//        Appointment appointment = new Appointment(appointmentRequestDto.appointmentDate(), requestRequestDto.patientRequestDto().patientId(), surgeryRequestDto.surgeryName(), dentistRequestDto );
//        Appointment savedAppointment = appointmentRepository.save(appointment);
//        return Optional.of(new AppointmentResponseDto(
//                savedAppointment.getAppointmentDate(),
//                savedAppointment.getPatientId(),
//                savedAppointment.getSurgeryId(),
//                savedAppointment.getDentistId()
//        ));
        Dentist dentist = dentistRepository.findById(appointmentRequestDto.dentistId())
                .orElseThrow(() -> new RuntimeException("Dentist not found"));


        Patient patient = patientRepository.findById(appointmentRequestDto.patientId())
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        Surgery surgery = surgeryRepository.findById(appointmentRequestDto.surgeryId())
                .orElseThrow(() -> new RuntimeException("Surgery not found"));

        Appointment appointment = new Appointment();
        appointment.setDentist(dentist);
        appointment.setPatient(patient);
        appointment.setSurgery(surgery);
        appointment.setAppointmentDate(appointmentRequestDto.appointmentDate());

        Appointment savedAppointment =  appointmentRepository.save(appointment);
        return new AppointmentResponseDto(savedAppointment.getAppointmentDate(), savedAppointment.getPatient().getPatientId(), savedAppointment.getSurgery().getSurgeryId(), savedAppointment.getDentist().getDentistId());
    }
}
