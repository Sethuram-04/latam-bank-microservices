package com.latambank.depositservice.model;
import jakarta.persistence.*;
@Entity
public class Deposit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long accountId;
    private double amount;
    private String maturityDate;
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public String getMaturityDate() { return maturityDate; }
    public void setMaturityDate(String maturityDate) { this.maturityDate = maturityDate; }
}
