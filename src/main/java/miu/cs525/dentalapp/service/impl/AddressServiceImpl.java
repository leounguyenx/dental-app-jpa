package miu.cs525.dentalapp.service.impl;

import miu.cs525.dentalapp.model.Address;
import miu.cs525.dentalapp.repository.AddressRepository;
import miu.cs525.dentalapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    @Override
    public Address addNewAddress(Address address) {
        return addressRepository.save(address);
    }
}
