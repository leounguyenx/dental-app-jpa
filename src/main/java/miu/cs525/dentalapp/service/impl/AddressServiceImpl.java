package miu.cs525.dentalapp.service.impl;

import miu.cs525.dentalapp.dto.request.AddressRequestDto;
import miu.cs525.dentalapp.dto.response.AddressResponseDto;
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
    public AddressResponseDto addNewAddress(AddressRequestDto addressRequestDto) {
        Address address = new Address(addressRequestDto.street(), addressRequestDto.city(), addressRequestDto.zipCode());
        Address savedAddress = addressRepository.save(address);
        return new AddressResponseDto(savedAddress.getStreet(), savedAddress.getCity(), savedAddress.getZipCode());
    }
}
