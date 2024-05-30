package org.example.demospringbootcustomermanagement.repository;

import org.example.demospringbootcustomermanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
//@Repository
public interface IustomerRepository extends JpaRepository<Customer,Long> {
}
