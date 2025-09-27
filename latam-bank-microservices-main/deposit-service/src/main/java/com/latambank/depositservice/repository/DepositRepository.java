package com.latambank.depositservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.latambank.depositservice.model.Deposit;
public interface DepositRepository extends JpaRepository<Deposit, Long> { }
