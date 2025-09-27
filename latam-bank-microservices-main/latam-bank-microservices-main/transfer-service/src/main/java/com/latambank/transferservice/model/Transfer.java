package com.latambank.transferservice.model;
import jakarta.persistence.*;
@Entity
public class Transfer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long fromAccountId;
    private Long toAccountId;
    private double amount;
    private String status;
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getFromAccountId() { return fromAccountId; }
    public void setFromAccountId(Long fromAccountId) { this.fromAccountId = fromAccountId; }
    public Long getToAccountId() { return toAccountId; }
    public void setToAccountId(Long toAccountId) { this.toAccountId = toAccountId; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
