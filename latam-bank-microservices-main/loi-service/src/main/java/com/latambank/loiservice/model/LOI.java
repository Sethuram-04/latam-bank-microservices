package com.latambank.loiservice.model;
import jakarta.persistence.*;
@Entity
public class LOI {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String applicant;
    private String details;
    private String status;
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getApplicant() { return applicant; }
    public void setApplicant(String applicant) { this.applicant = applicant; }
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
