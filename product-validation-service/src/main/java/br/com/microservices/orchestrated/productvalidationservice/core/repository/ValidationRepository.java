package br.com.microservices.orchestrated.productvalidationservice.core.repository;

import br.com.microservices.orchestrated.productvalidationservice.core.model.Validation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValidationRepository extends JpaRepository<Validation, Integer> {
}
