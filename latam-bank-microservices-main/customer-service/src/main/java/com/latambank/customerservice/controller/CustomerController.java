package com.latambank.customerservice.controller;

import com.latambank.customerservice.model.Customer;
import com.latambank.customerservice.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerRepository repo;
    public CustomerController(CustomerRepository repo) { this.repo = repo; }

    @PostMapping
    public Customer create(@RequestBody Customer obj) {
        return repo.save(obj);
    }

    @GetMapping
    public List<Customer> getAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

}