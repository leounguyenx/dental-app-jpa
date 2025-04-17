package miu.cs525.dentalapp.service;

import miu.cs525.dentalapp.dto.request.SurgeryRequestDto;
import miu.cs525.dentalapp.dto.response.SurgeryResponseDto;

public interface SurgeryService {
    SurgeryResponseDto addNewSurgery(SurgeryRequestDto surgeryRequestDto);
}
