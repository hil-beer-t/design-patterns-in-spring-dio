package com.hilbert.designpatternsspring.repository;

import com.hilbert.designpatternsspring.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}