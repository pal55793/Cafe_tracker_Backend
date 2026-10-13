package com.example.demo.utils;


import java.time.LocalDateTime;

public abstract class BaseEntity {

    

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean active = true;

    public BaseEntity() {
    }

    public BaseEntity( LocalDateTime createdAt, LocalDateTime updatedAt, Boolean active) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.active = active;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}