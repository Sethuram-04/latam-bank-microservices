package com.latambank.customerservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.latambank.customerservice.model.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Long> { }
