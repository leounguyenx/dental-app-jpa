package miu.cs525.dentalapp.service;

import miu.cs525.dentalapp.dto.request.DentistRequestDto;
import miu.cs525.dentalapp.dto.response.DentistResponseDto;

public interface DentistService {
    DentistResponseDto addNewDentist(DentistRequestDto dentistRequestDto);
}
