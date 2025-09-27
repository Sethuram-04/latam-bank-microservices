package com.latambank.loiservice.controller;

import com.latambank.loiservice.model.LOI;
import com.latambank.loiservice.repository.LOIRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/lois")
public class LOIController {
    private final LOIRepository repo;
    public LOIController(LOIRepository repo) { this.repo = repo; }

    @PostMapping
    public LOI create(@RequestBody LOI obj) {
        obj.setStatus("CREATED");
        return repo.save(obj);
    }

    @GetMapping
    public List<LOI> getAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public LOI getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping("/{id}/submit")
    public LOI submit(@PathVariable Long id) {
        return repo.findById(id).map(l -> { l.setStatus("SUBMITTED"); return repo.save(l); }).orElse(null);
    }

    @PostMapping("/{id}/approve")
    public LOI approve(@PathVariable Long id) {
        return repo.findById(id).map(l -> { l.setStatus("APPROVED"); return repo.save(l); }).orElse(null);
    }

    @PostMapping("/{id}/reject")
    public LOI reject(@PathVariable Long id) {
        return repo.findById(id).map(l -> { l.setStatus("REJECTED"); return repo.save(l); }).orElse(null);
    }

}