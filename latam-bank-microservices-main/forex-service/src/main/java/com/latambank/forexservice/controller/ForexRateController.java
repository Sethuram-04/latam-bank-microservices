package com.latambank.forexservice.controller;

import com.latambank.forexservice.model.ForexRate;
import com.latambank.forexservice.repository.ForexRateRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/forex")
public class ForexRateController {
    private final ForexRateRepository repo;
    public ForexRateController(ForexRateRepository repo) { this.repo = repo; }

    @PostMapping
    public ForexRate create(@RequestBody ForexRate obj) {
        return repo.save(obj);
    }

    @GetMapping
    public List<ForexRate> getAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public ForexRate getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

}