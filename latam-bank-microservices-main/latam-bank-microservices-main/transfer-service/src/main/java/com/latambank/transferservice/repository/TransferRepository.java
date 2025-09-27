package com.latambank.transferservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.latambank.transferservice.model.Transfer;
public interface TransferRepository extends JpaRepository<Transfer, Long> { }
