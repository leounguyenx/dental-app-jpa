package miu.cs525.dentalapp.service;

import miu.cs525.dentalapp.dto.request.AddressRequestDto;
import miu.cs525.dentalapp.dto.request.PatientRequestDto;
import miu.cs525.dentalapp.dto.response.PatientResponseDto;
import miu.cs525.dentalapp.model.Patient;

public interface PatientService {
    PatientResponseDto addNewPatient(PatientRequestDto patientRequestDto, AddressRequestDto addressRequestDto);
}
