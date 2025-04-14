package miu.cs525.dentalapp;

import miu.cs525.dentalapp.model.*;
import miu.cs525.dentalapp.repository.*;
import miu.cs525.dentalapp.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
            AppointmentRepository appointmentRepo,
            AddressRepository addressRepo,
            RequestRepository requestRepo
    ) {
        return args -> {
            // ----- Addresses -----
            Address address1 = new Address(1, "123 Main St", "London", "LON123");
            Address address2 = new Address(2, "456 Queen Rd", "London", "LON456");
            Address address3 = new Address(3, "789 Oxford Ave", "London", "LON789");
            addressRepo.saveAll(List.of(address1, address2, address3));

            // ----- Dentists -----
            Dentist tony = new Dentist("Tony", "Smith", "tony.smith@example.com", "555-1111", "Orthodontics");
            Dentist helen = new Dentist("Helen", "Pearson", "helen.pearson@example.com", "555-2222", "General");
            Dentist robin = new Dentist("Robin", "Plevin", "robin.plevin@example.com", "555-3333", "Cosmetic");
            dentistRepo.saveAll(List.of(tony, helen, robin));

            // ----- Surgeries -----
            Surgery s10 = new Surgery("S10", "020-000-1010", address1);
            Surgery s13 = new Surgery("S13", "020-000-1013", address2);
            Surgery s15 = new Surgery("S15", "020-000-1015", address3);
            surgeryRepo.saveAll(List.of(s10, s13, s15));

            // ----- Patients -----
            Patient gillian = new Patient("P100", "Gillian", "White", "gillian@example.com", "070-111-1111", address1);
            Patient jill = new Patient("P105", "Jill", "Bell", "jill@example.com", "070-222-2222", address2);
            Patient ian = new Patient("P108", "Ian", "MacKay", "ian@example.com", "070-333-3333", address3);
            Patient john = new Patient("P110", "John", "Walker", "john@example.com", "070-444-4444", address1);

            patientRepo.saveAll(List.of(gillian, jill, ian, john));

            // ----- Requests -----
            Request r1 = new Request("12-Sep-13", gillian);
            Request r2 = new Request("12-Sep-13", jill);
            Request r3 = new Request("12-Sep-13", ian);
            Request r4 = new Request("14-Sep-13", ian);
            Request r5 = new Request("14-Sep-13", jill);
            Request r6 = new Request("15-Sep-13", john);

            requestRepo.saveAll(List.of(r1, r2, r3, r4, r5, r6));

            // ----- Appointments -----

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy", Locale.ENGLISH);

            Appointment a1 = new Appointment("12-Sep-13", r1, tony);
            Appointment a2 = new Appointment("12-Sep-13", r2, tony);
            Appointment a3 = new Appointment("12-Sep-13", r3, helen);
            Appointment a4 = new Appointment("14-Sep-13", r4, helen);
            Appointment a5 = new Appointment("14-Sep-13", r5, robin);
            Appointment a6 = new Appointment("15-Sep-13", r6, robin);

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