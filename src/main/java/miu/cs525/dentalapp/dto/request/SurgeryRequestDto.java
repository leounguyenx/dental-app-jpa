package miu.cs525.dentalapp.dto.request;

public record SurgeryRequestDto(
        String surgeryName,
        String phoneNumber,
        AddressRequestDto addressRequestDto
) {
}
