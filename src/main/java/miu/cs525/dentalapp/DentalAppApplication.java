package miu.cs525.dentalapp;

import miu.cs525.dentalapp.model.*;
import miu.cs525.dentalapp.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Flow;

@SpringBootApplication
public class DentalAppApplication {

    private final PatientService patientService;
    private final DentistService dentistService;
    private final AddressService addressService;
    private final AppointmentService appointmentService;
    private final RequestService requestService;
    private final SurgeryService surgeryService;

    public DentalAppApplication(PatientService patientService, DentistService dentistService, AddressService addressService, AppointmentService appointmentService, RequestService requestService, SurgeryService surgeryService) {
        this.patientService = patientService;
        this.dentistService = dentistService;
        this.addressService = addressService;
        this.appointmentService = appointmentService;
        this.requestService = requestService;
        this.surgeryService = surgeryService;
    }


    public static void main(String[] args) {
        SpringApplication.run(DentalAppApplication.class, args);
        System.out.println("Dental App is running...");
    }
    private Patient addNewPatient(Patient patient) {
        return patientService.addNewPatient(patient);
    }

    private Request addNewRequest(Request request) {
        return requestService.addNewRequest(request);
    }

    private Dentist addNewDentist(Dentist dentist) {
        return dentistService.addNewDentist(dentist);
    }

    private Surgery addNewSurgery(Surgery surgery) {
        return surgeryService.addNewSurgery(surgery);
    }
    private Appointment addNewAppointment(Appointment appointment) {
        return appointmentService.addNewAppointment(appointment);
    }
}