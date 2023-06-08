package com.Rhea.bugTracker.model;

import jakarta.persistence.*;


@Entity
@Table(name = "bug")
public class bug {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "bug_ID")
    private Long ID;
    @Column(name = "bug_tittle")
    private String tittle;
    @Column(name = "bug_description")
    private String description;
    @Column(name = "bug_status")
    private String status;
    @Column(name = "bug_priority")
    private String priority;

    public bug() {
    }

    public bug(String tittle, String description, String status, String priority) {
        this.tittle = tittle;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    //setters and getters

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}


