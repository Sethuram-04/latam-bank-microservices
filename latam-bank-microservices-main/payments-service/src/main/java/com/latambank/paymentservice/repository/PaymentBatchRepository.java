package com.latambank.paymentservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.latambank.paymentservice.model.PaymentBatch;
public interface PaymentBatchRepository extends JpaRepository<PaymentBatch, Long> { }
