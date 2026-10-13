package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class CategoryRequest {

    private String name;
    private String description;
    private String imageUrl;
    private Integer displayOrder;
    private Boolean active;
    private List<String> menuIds;

    public CategoryRequest() {
        this.menuIds = new ArrayList<>();
    }

    public CategoryRequest(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.imageUrl = builder.imageUrl;
        this.displayOrder = builder.displayOrder;
        this.active = builder.active;
        this.menuIds = builder.menuIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String description;
        private String imageUrl;
        private Integer displayOrder;
        private Boolean active;
        private List<String> menuIds = new ArrayList<>();

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder displayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }

        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder menuIds(List<String> menuIds) {
            this.menuIds = menuIds;
            return this;
        }

        public CategoryRequest build() {
            return new CategoryRequest(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public Boolean getActive() {
        return active;
    }

    public List<String> getMenuIds() {
        return menuIds;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setMenuIds(List<String> menuIds) {
        this.menuIds = menuIds;
    }
}