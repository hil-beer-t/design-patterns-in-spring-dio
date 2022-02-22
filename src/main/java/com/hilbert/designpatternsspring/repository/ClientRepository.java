package com.hilbert.designpatternsspring.repository;

import com.hilbert.designpatternsspring.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}