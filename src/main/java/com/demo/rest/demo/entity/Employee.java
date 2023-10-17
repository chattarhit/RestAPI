package com.demo.rest.demo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Employee {

    @Id
    @Column(name = "employee_id")
    private int eId;
    @Column(name = "employee_name")
    private String eName;
    @Column(name = "employee_email")
    private Integer email;

    public Employee(Integer eId, String eName, Integer email) {
        this.eId = eId;
        this.eName = eName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", email=" + email +
                '}';
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }

    public Employee() {
    }
}
