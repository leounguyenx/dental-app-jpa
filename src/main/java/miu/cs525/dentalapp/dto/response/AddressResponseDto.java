package miu.cs525.dentalapp.dto.response;

public record AddressResponseDto(
        String addressId,
        String street,
        String city,
        String zipCode
) {
}
