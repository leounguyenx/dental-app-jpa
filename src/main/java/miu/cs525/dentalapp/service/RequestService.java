package miu.cs525.dentalapp.service;

import miu.cs525.dentalapp.dto.request.RequestRequestDto;
import miu.cs525.dentalapp.dto.response.RequestResponseDto;

public interface RequestService {
    RequestResponseDto addNewRequest(RequestRequestDto requestRequestDto, String patientId);
}
