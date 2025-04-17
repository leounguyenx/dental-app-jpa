package miu.cs525.dentalapp.service;

import miu.cs525.dentalapp.dto.request.AddressRequestDto;
import miu.cs525.dentalapp.dto.request.PatientRequestDto;
import miu.cs525.dentalapp.dto.response.PatientResponseDto;

import java.util.Optional;

public interface PatientService {
    Optional<PatientResponseDto> addNewPatient(PatientRequestDto patientRequestDto, AddressRequestDto addressRequestDto);
}
