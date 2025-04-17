package miu.cs525.dentalapp.service.impl;

import lombok.RequiredArgsConstructor;
import miu.cs525.dentalapp.dto.request.DentistRequestDto;
import miu.cs525.dentalapp.dto.response.DentistResponseDto;
import miu.cs525.dentalapp.model.Dentist;
import miu.cs525.dentalapp.repository.DentistRepository;
import miu.cs525.dentalapp.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DentistServiceImpl implements DentistService {
    @Autowired
    DentistRepository dentistRepository;

    @Autowired
    DentistServiceImpl(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public DentistResponseDto addNewDentist(DentistRequestDto dentistRequestDto) {
        Dentist dentist = new Dentist(dentistRequestDto.firstName(), dentistRequestDto.lastName(), dentistRequestDto.email(), dentistRequestDto.phone(), dentistRequestDto.specialization());
        Dentist savedDentist = dentistRepository.save(dentist);
        return new DentistResponseDto(savedDentist.getDentistId(), savedDentist.getFirstName(), savedDentist.getLastName(), savedDentist.getEmail(), savedDentist.getPhone(), savedDentist.getSpecialization());
    }
}
