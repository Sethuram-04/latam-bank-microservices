package com.latambank.loiservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.latambank.loiservice.model.LOI;
public interface LOIRepository extends JpaRepository<LOI, Long> { }
