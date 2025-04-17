package miu.cs525.dentalapp.service.impl;

import lombok.RequiredArgsConstructor;
import miu.cs525.dentalapp.dto.request.SurgeryRequestDto;
import miu.cs525.dentalapp.dto.response.SurgeryResponseDto;
import miu.cs525.dentalapp.repository.SurgeryRepository;
import miu.cs525.dentalapp.service.SurgeryService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurgeryServiceImpl implements SurgeryService {

    SurgeryRepository surgeryRepository;

    @Override
    public SurgeryResponseDto addNewSurgery(SurgeryRequestDto surgeryRequestDto) {
        return null;
    }
}
