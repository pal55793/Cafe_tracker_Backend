package com.example.demo.entity;

import java.util.Map;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "menu_items")
public class MenuItem  {
	
	@Id
    private String id;

    private String categoryId;
    private String name;
    private String description;
    private String imageUrl;
    private Map<String, Double> prices;
    private Boolean available;
    private Boolean recommended;

    public MenuItem() {
    }

    private MenuItem(Builder builder) {
        setId(builder.id);

        this.categoryId = builder.categoryId;
        this.name = builder.name;
        this.description = builder.description;
        this.imageUrl = builder.imageUrl;
        this.prices = builder.prices;
        this.available = builder.available;
        this.recommended = builder.recommended;
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
        private Map<String, Double> prices;
        private Boolean available = true;
        private Boolean recommended = false;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

       

        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

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

        public Builder prices(Map<String, Double> map) {
            this.prices = map;
            return this;
        }

        public Builder available(Boolean available) {
            this.available = available;
            return this;
        }

        public Builder recommended(Boolean recommended) {
            this.recommended = recommended;
            return this;
        }

        public MenuItem build() {
            return new MenuItem(this);
        }
    }
    
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

    public Map<String, Double> getPrices() {
        return prices;
    }

    public void setPrices(Map<String, Double> prices) {
        this.prices = prices;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getRecommended() {
        return recommended;
    }

    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", available=" + available +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MenuItem menuItem = (MenuItem) o;

        return Objects.equals(getId(), menuItem.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}