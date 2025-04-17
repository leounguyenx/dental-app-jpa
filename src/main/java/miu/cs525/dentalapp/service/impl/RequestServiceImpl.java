package miu.cs525.dentalapp.service.impl;

import lombok.RequiredArgsConstructor;
import miu.cs525.dentalapp.dto.request.RequestRequestDto;
import miu.cs525.dentalapp.dto.response.RequestResponseDto;
import miu.cs525.dentalapp.model.Patient;
import miu.cs525.dentalapp.model.Request;
import miu.cs525.dentalapp.repository.PatientRepository;
import miu.cs525.dentalapp.repository.RequestRepository;
import miu.cs525.dentalapp.service.RequestService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RequestServiceImpl implements RequestService {
    RequestRepository requestRepository;
    PatientRepository patientRepository;

    @Override
    public RequestResponseDto addNewRequest(RequestRequestDto requestRequestDto, String patientId) {
        Patient patient = patientRepository.findById(requestRequestDto.patientId())
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        Request request = new Request(requestRequestDto.requestDate(), patient.getPatientId());
        Request savedRequest = requestRepository.save(request);
        return new RequestResponseDto(savedRequest.getRequestDate(), savedRequest.getPatientId());
    }
}
