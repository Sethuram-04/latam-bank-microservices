package com.latambank.forexservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.latambank.forexservice.model.ForexRate;
public interface ForexRateRepository extends JpaRepository<ForexRate, Long> { }
