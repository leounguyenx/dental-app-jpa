package miu.cs525.dentalapp.repository;

import miu.cs525.dentalapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}
