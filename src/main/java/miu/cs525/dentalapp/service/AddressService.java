package miu.cs525.dentalapp.service;

import miu.cs525.dentalapp.dto.request.AddressRequestDto;
import miu.cs525.dentalapp.dto.response.AddressResponseDto;

public interface AddressService {
    AddressResponseDto addNewAddress(AddressRequestDto addressRequestDto);
}
