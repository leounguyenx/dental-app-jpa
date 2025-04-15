package miu.cs525.dentalapp;

import miu.cs525.dentalapp.dto.request.*;
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

    public static void main(String[] args) {
        SpringApplication.run(DentalAppApplication.class, args);
        System.out.println("Dental App is running...");
    }

    @Bean
    CommandLineRunner runner(
    ) {
        return args -> {

            // Create PatientRequestDto
            PatientRequestDto patientRequestDto1 = new PatientRequestDto(
                    "P100", "Gillian", "White", "gillian@example.com", "070-111-1111",
                    new AddressRequestDto("123 Main St", "London", "123912")
            );
            PatientRequestDto patientRequestDto2 = new PatientRequestDto(
                    "P105", "Jill", "Bell", "jill@example.com", "070-222-2222",
                    new AddressRequestDto("456 Queen Rd", "London", "912313")
            );
            PatientRequestDto patientRequestDto3 = new PatientRequestDto(
                    "P108", "Ian", "MacKay", "ian@example.com", "070-333-3333",
                    new AddressRequestDto("789 Oxford Ave", "London", "123123")
            );

            // Create DentistRequestDto
            DentistRequestDto dentistRequestDto1 = new DentistRequestDto("Tony", "Smith", "tony.smith@example.com", "555-1111", "Orthodontics");
            DentistRequestDto dentistRequestDto2 = new DentistRequestDto("Helen", "Pearson", "helen.pearson@example.com", "555-2222", "General");
            DentistRequestDto dentistRequestDto3 = new DentistRequestDto("Robin", "Plevin", "robin.plevin@example.com", "555-3333", "Cosmetic");


            // Create SurgeryRequestDto
            SurgeryRequestDto surgeryRequestDto1 = new SurgeryRequestDto("S10", "020-000-1010",
                    new AddressRequestDto("123 Main St", "Berlin", "123123"));
            SurgeryRequestDto surgeryRequestDto2 = new SurgeryRequestDto("S13", "020-000-1013",
                    new AddressRequestDto("123 Jude Rd", "Alabama", "12325"));
            SurgeryRequestDto surgeryRequestDto3 = new SurgeryRequestDto("S15", "020-000-1015",
                    new AddressRequestDto("1000 Abc Rd", "Iowa", "34344"));

            // Create RequestRequestDto
            RequestRequestDto requestRequestDto1 = new RequestRequestDto("12-Sep-13", patientRequestDto1);
            RequestRequestDto requestRequestDto2 = new RequestRequestDto("12-Sep-13", patientRequestDto2);
            RequestRequestDto requestRequestDto3 = new RequestRequestDto("12-Sep-13", patientRequestDto3);
            RequestRequestDto requestRequestDto4 = new RequestRequestDto("14-Sep-13", patientRequestDto3);
            RequestRequestDto requestRequestDto5 = new RequestRequestDto("14-Sep-13", patientRequestDto2);
            RequestRequestDto requestRequestDto6 = new RequestRequestDto("15-Sep-13", patientRequestDto1);

            // Create AppointmentRequestDto
            AppointmentRequestDto appointmentRequestDto = new AppointmentRequestDto("12-Sep-13",
                    surgeryRequestDto3, patientRequestDto1, dentistRequestDto1);
            AppointmentRequestDto appointmentRequestDto1 = new AppointmentRequestDto("12-Sep-13",
                    surgeryRequestDto1, patientRequestDto2, dentistRequestDto2);
            AppointmentRequestDto appointmentRequestDto2 = new AppointmentRequestDto("12-Sep-15",
                    surgeryRequestDto2, patientRequestDto3, dentistRequestDto3);
        };
    }
}