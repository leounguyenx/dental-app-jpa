package miu.cs525.dentalapp.service.impl;

import miu.cs525.dentalapp.model.Dentist;
import miu.cs525.dentalapp.repository.DentistRepository;
import miu.cs525.dentalapp.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DentistServiceImpl implements DentistService {
    @Autowired
    DentistRepository dentistRepository;

    @Autowired
    DentistServiceImpl(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public Dentist addNewDentist(Dentist dentist) {
        return dentistRepository.save(dentist);
    }
}
