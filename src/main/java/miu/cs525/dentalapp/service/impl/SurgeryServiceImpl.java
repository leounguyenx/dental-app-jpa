package miu.cs525.dentalapp.service.impl;

import miu.cs525.dentalapp.model.Surgery;
import miu.cs525.dentalapp.repository.SurgeryRepository;
import miu.cs525.dentalapp.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurgeryServiceImpl implements SurgeryService {

    @Autowired
    SurgeryRepository surgeryRepository;

    @Autowired
    public SurgeryServiceImpl(SurgeryRepository surgeryRepository) {
        this.surgeryRepository = surgeryRepository;
    }

    @Override
    public Surgery addNewSurgery(Surgery surgery) {
        return surgeryRepository.save(surgery);
    }
}
