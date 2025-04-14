package miu.cs525.dentalapp;

import miu.cs525.dentalapp.model.*;
import miu.cs525.dentalapp.repository.AppointmentRepository;
import miu.cs525.dentalapp.repository.DentistRepository;
import miu.cs525.dentalapp.repository.PatientRepository;
import miu.cs525.dentalapp.repository.SurgeryRepository;
import miu.cs525.dentalapp.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
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

    @Bean
    CommandLineRunner runner(
            PatientRepository patientRepo,
            DentistRepository dentistRepo,
            SurgeryRepository surgeryRepo,
            AppointmentRepository appointmentRepo
    ) {
        return args -> {
            // Create Dentists
            Dentist tony = new Dentist("Tony Smith");
            Dentist helen = new Dentist("Helen Pearson");
            Dentist robin = new Dentist("Robin Plevin");

            dentistRepo.saveAll(List.of(tony, helen, robin));

            // Create Patients
            Patient gillian = new Patient("P100", "Gillian White");
            Patient jill = new Patient("P105", "Jill Bell");
            Patient ian = new Patient("P108", "Ian MacKay");
            Patient john = new Patient("P110", "John Walker");

            patientRepo.saveAll(List.of(gillian, jill, ian, john));

            // Create Surgeries
            Surgery s10 = new Surgery("S10");
            Surgery s13 = new Surgery("S13");
            Surgery s15 = new Surgery("S15");

            surgeryRepo.saveAll(List.of(s10, s13, s15));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy HH.mm", Locale.ENGLISH);

            // Create Appointments
            Appointment a1 = new Appointment(LocalDateTime.parse("12-Sep-13 10.00", formatter), tony, gillian, s15);
            Appointment a2 = new Appointment(LocalDateTime.parse("12-Sep-13 12.00", formatter), tony, jill, s15);
            Appointment a3 = new Appointment(LocalDateTime.parse("12-Sep-13 10.00", formatter), helen, ian, s10);
            Appointment a4 = new Appointment(LocalDateTime.parse("14-Sep-13 14.00", formatter), helen, ian, s10);
            Appointment a5 = new Appointment(LocalDateTime.parse("14-Sep-13 16.30", formatter), robin, jill, s15);
            Appointment a6 = new Appointment(LocalDateTime.parse("15-Sep-13 18.00", formatter), robin, john, s13);

            appointmentRepo.saveAll(List.of(a1, a2, a3, a4, a5, a6));
        };
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