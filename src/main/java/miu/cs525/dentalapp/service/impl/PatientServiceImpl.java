package miu.cs525.dentalapp.service.impl;

import miu.cs525.dentalapp.model.Patient;
import miu.cs525.dentalapp.repository.PatientRepository;
import miu.cs525.dentalapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    @Override
    public Patient addNewPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
