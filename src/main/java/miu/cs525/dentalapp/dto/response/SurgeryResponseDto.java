package miu.cs525.dentalapp.dto.response;

import miu.cs525.dentalapp.dto.request.AddressRequestDto;

public record SurgeryResponseDto(
        String surgeryId,
        String surgeryName,
        String phoneNumber,
        AddressRequestDto addressRequestDto
) {
}
