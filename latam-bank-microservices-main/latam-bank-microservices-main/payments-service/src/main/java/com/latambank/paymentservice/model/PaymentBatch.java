package com.latambank.paymentservice.model;
import jakarta.persistence.*;
@Entity
public class PaymentBatch {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String batchName;
    private double totalAmount;
    private String status;
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getBatchName() { return batchName; }
    public void setBatchName(String batchName) { this.batchName = batchName; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
