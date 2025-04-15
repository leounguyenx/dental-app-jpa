package miu.cs525.dentalapp.dto.request;

public record AddressRequestDto(
        String street,
        String city,
        String zipCode
) {
}
