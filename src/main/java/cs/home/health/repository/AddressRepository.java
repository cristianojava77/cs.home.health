package cs.home.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cs.home.health.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
