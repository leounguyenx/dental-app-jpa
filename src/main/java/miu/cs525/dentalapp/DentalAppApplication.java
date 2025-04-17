package miu.cs525.dentalapp;

import lombok.RequiredArgsConstructor;
import miu.cs525.dentalapp.dto.request.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class DentalAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DentalAppApplication.class, args);
        System.out.println("Dental App is running...");
    }

    @Bean
    CommandLineRunner runner(ApplicationContext ctx) {
        return args -> {

            // Create PatientRequestDto
            PatientRequestDto patientRequestDto1 = new PatientRequestDto(
                    "P100", "Gillian", "White", "gillian@example.com", "070-111-1111", "12-Sep-13",
                    new AddressRequestDto("123 Main St", "London", "123912")
            );
            PatientRequestDto patientRequestDto2 = new PatientRequestDto(
                    "P105", "Jill", "Bell", "jill@example.com", "070-222-2222", "14-Sep-13",
                    new AddressRequestDto("456 Queen Rd", "London", "912313")
            );
            PatientRequestDto patientRequestDto3 = new PatientRequestDto(
                    "P108", "Ian", "MacKay", "ian@example.com", "070-333-3333", "15-Sep-13",
                    new AddressRequestDto("789 Oxford Ave", "London", "123123")
            );

            // Create DentistRequestDto
            DentistRequestDto dentistRequestDto1 = new DentistRequestDto("Tony", "Smith", "tony.smith@example.com", "555-1111", "Orthodontics");
            DentistRequestDto dentistRequestDto2 = new DentistRequestDto("Helen", "Pearson", "helen.pearson@example.com", "555-2222", "General");
            DentistRequestDto dentistRequestDto3 = new DentistRequestDto("Robin", "Plevin", "robin.plevin@example.com", "555-3333", "Cosmetic");


            // Create SurgeryRequestDto
            SurgeryRequestDto surgeryRequestDto1 = new SurgeryRequestDto("S10","Surgery 10", "020-000-1010",
                    new AddressRequestDto("123 Main St", "Berlin", "123123"));
            SurgeryRequestDto surgeryRequestDto2 = new SurgeryRequestDto("S13", "Surgery 13", "020-000-1013",
                    new AddressRequestDto("123 Jude Rd", "Alabama", "12325"));
            SurgeryRequestDto surgeryRequestDto3 = new SurgeryRequestDto("S15","Surgery 15", "020-000-1015",
                    new AddressRequestDto("1000 Abc Rd", "Iowa", "34344"));

            // Create RequestRequestDto
            RequestRequestDto requestRequestDto1 = new RequestRequestDto("12-Sep-13", "P100");
            RequestRequestDto requestRequestDto2 = new RequestRequestDto("12-Sep-13", "105");
            RequestRequestDto requestRequestDto3 = new RequestRequestDto("12-Sep-13", "108");
//            RequestRequestDto requestRequestDto4 = new RequestRequestDto("14-Sep-13", patientRequestDto3);
//            RequestRequestDto requestRequestDto5 = new RequestRequestDto("14-Sep-13", patientRequestDto2);
//            RequestRequestDto requestRequestDto6 = new RequestRequestDto("15-Sep-13", patientRequestDto1);

            // Create AppointmentRequestDto
            AppointmentRequestDto appointmentRequestDto1 = new AppointmentRequestDto("12-Sep-13", "1", "S10","1", "100");
            AppointmentRequestDto appointmentRequestDto2 = new AppointmentRequestDto("12-Sep-14", "2", "S13","2", "105");
            AppointmentRequestDto appointmentRequestDto3 = new AppointmentRequestDto("12-Sep-15", "3", "S15","3", "108");

        };
    }
}