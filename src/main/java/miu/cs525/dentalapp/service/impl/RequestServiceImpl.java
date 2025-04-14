package miu.cs525.dentalapp.service.impl;

import miu.cs525.dentalapp.model.Request;
import miu.cs525.dentalapp.repository.RequestRepository;
import miu.cs525.dentalapp.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    RequestRepository requestRepository;

    @Autowired
    RequestServiceImpl(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }


    @Override
    public Request addNewRequest(Request request) {
        return requestRepository.save(request);
    }
}
