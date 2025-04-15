package miu.cs525.dentalapp.service.impl;

import lombok.RequiredArgsConstructor;
import miu.cs525.dentalapp.dto.request.AddressRequestDto;
import miu.cs525.dentalapp.dto.request.PatientRequestDto;
import miu.cs525.dentalapp.dto.response.PatientResponseDto;
import miu.cs525.dentalapp.model.Address;
import miu.cs525.dentalapp.model.Patient;
import miu.cs525.dentalapp.repository.AddressRepository;
import miu.cs525.dentalapp.repository.PatientRepository;
import miu.cs525.dentalapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final AddressRepository addressRepository;



    @Override
    public PatientResponseDto addNewPatient(PatientRequestDto patientRequestDto, AddressRequestDto addressRequestDto) {
        Address address = new Address(addressRequestDto.street(), addressRequestDto.city(), addressRequestDto.zipCode());
        Patient patient = new Patient(patientRequestDto.firstName(), patientRequestDto.lastName(),
                patientRequestDto.email(), patientRequestDto.phone(), patientRequestDto.dob(), address);
        Patient savedPatient = patientRepository.save(patient);

        return new PatientResponseDto(savedPatient.getPatientId(), savedPatient.getFirstName(), savedPatient.getLastName(),
                savedPatient.getEmail(), savedPatient.getPhone(), savedPatient.getDob(), savedPatient.getAddress());
    }
}
