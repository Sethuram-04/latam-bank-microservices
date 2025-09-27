package com.latambank.paymentservice.controller;

import com.latambank.paymentservice.model.PaymentBatch;
import com.latambank.paymentservice.repository.PaymentBatchRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentBatchController {
    private final PaymentBatchRepository repo;
    public PaymentBatchController(PaymentBatchRepository repo) { this.repo = repo; }

    @PostMapping
    public PaymentBatch create(@RequestBody PaymentBatch obj) {
        obj.setStatus("CREATED");
        return repo.save(obj);
    }

    @GetMapping
    public List<PaymentBatch> getAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public PaymentBatch getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping("/{id}/process")
    public PaymentBatch process(@PathVariable Long id) {
        return repo.findById(id).map(p -> { p.setStatus("PROCESSED"); return repo.save(p); }).orElse(null);
    }

}