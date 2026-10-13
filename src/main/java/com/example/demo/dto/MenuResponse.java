package com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.Map;

public class MenuResponse {

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getVeg() {
		return veg;
	}

	public void setVeg(Boolean veg) {
		this.veg = veg;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Map<String, Double> getPrices() {
		return prices;
	}

	public void setPrices(Map<String, Double> prices) {
		this.prices = prices;
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

	private String id;
    private String categoryId;
    private String name;
    private String description;
    private String imageUrl;
    private Boolean veg;
    private Boolean available;
    private Map<String, Double> prices;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public MenuResponse() {}

    public MenuResponse(Builder builder) {
        this.id = builder.id;
        this.categoryId = builder.categoryId;
        this.name = builder.name;
        this.description = builder.description;
        this.imageUrl = builder.imageUrl;
        this.veg = builder.veg;
        this.available = builder.available;
        this.prices = builder.prices;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String categoryId;
        private String name;
        private String description;
        private String imageUrl;
        private Boolean veg;
        private Boolean available;
        private Map<String, Double> prices;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Builder id(String id){this.id=id;return this;}
        public Builder categoryId(String categoryId){this.categoryId=categoryId;return this;}
        public Builder name(String name){this.name=name;return this;}
        public Builder description(String description){this.description=description;return this;}
        public Builder imageUrl(String imageUrl){this.imageUrl=imageUrl;return this;}
        public Builder veg(Boolean veg){this.veg=veg;return this;}
        public Builder available(Boolean available){this.available=available;return this;}
        public Builder prices(Map<String, Double> prices){this.prices=prices;return this;}
        public Builder createdAt(LocalDateTime createdAt){this.createdAt=createdAt;return this;}
        public Builder updatedAt(LocalDateTime updatedAt){this.updatedAt=updatedAt;return this;}

        public MenuResponse build(){
            return new MenuResponse(this);
        }
    }

    
}