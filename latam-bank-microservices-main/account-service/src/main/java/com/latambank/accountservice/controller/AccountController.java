package com.latambank.accountservice.controller;

import com.latambank.accountservice.model.Account;
import com.latambank.accountservice.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountRepository repo;
    public AccountController(AccountRepository repo) { this.repo = repo; }

    @PostMapping
    public Account create(@RequestBody Account obj) {
        return repo.save(obj);
    }

    @GetMapping
    public List<Account> getAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public Account getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping("/{id}/credit")
    public Account credit(@PathVariable Long id, @RequestParam double amount) {
        return repo.findById(id).map(a -> { a.setBalance(a.getBalance()+amount); return repo.save(a); }).orElse(null);
    }

    @PostMapping("/{id}/debit")
    public Account debit(@PathVariable Long id, @RequestParam double amount) {
        return repo.findById(id).map(a -> { a.setBalance(a.getBalance()-amount); return repo.save(a); }).orElse(null);
    }

}