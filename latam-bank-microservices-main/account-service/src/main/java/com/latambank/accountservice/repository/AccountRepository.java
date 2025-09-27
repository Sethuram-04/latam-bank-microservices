package com.latambank.accountservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.latambank.accountservice.model.Account;
public interface AccountRepository extends JpaRepository<Account, Long> { }
