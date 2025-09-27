package com.latambank.transferservice.controller;

import com.latambank.transferservice.model.Transfer;
import com.latambank.transferservice.repository.TransferRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transfers")
public class TransferController {
    private final TransferRepository repo;
    public TransferController(TransferRepository repo) { this.repo = repo; }

    @PostMapping
    public Transfer create(@RequestBody Transfer obj) {
        return repo.save(obj);
    }

    @GetMapping
    public List<Transfer> getAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public Transfer getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

}