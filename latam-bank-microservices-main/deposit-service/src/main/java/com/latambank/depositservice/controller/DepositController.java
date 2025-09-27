package com.latambank.depositservice.controller;

import com.latambank.depositservice.model.Deposit;
import com.latambank.depositservice.repository.DepositRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/deposits")
public class DepositController {
    private final DepositRepository repo;
    public DepositController(DepositRepository repo) { this.repo = repo; }

    @PostMapping
    public Deposit create(@RequestBody Deposit obj) {
        return repo.save(obj);
    }

    @GetMapping
    public List<Deposit> getAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public Deposit getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @GetMapping("/{id}/maturity")
    public String maturity(@PathVariable Long id) {
        return repo.findById(id).map(d -> d.getMaturityDate()).orElse(null);
    }

}