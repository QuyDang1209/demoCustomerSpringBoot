package org.example.demospringbootcustomermanagement.service;

import org.example.demospringbootcustomermanagement.model.Customer;
import org.example.demospringbootcustomermanagement.repository.IustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private IustomerRepository iustomerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return iustomerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return iustomerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
    iustomerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
    iustomerRepository.deleteById(id);
    }
}
