package com.example.demo.dto;

import java.util.Map;

public class MenuRequest {

    private String categoryId;
    private String name;
    private String description;
    private String imageUrl;
    private Boolean veg;
    private String itemId;
    
    
    private Boolean available;
    private Map<String, Double> prices;

    public MenuRequest() {
    }

    public MenuRequest(Builder builder) {
        this.categoryId = builder.categoryId;
        this.name = builder.name;
        this.description = builder.description;
        this.imageUrl = builder.imageUrl;
        this.veg = builder.veg;
        this.available = builder.available;
        this.prices = builder.prices;
        this.itemId=builder.itemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String categoryId;
        private String name;
        private String description;
        private String imageUrl;
        private Boolean veg;
        private Boolean available;
        private Map<String, Double> prices;
        private String itemId;

        public Builder itemId(String itemId){this.itemId=itemId;return this;}
        public Builder categoryId(String categoryId){this.categoryId=categoryId;return this;}
        public Builder name(String name){this.name=name;return this;}
        public Builder description(String description){this.description=description;return this;}
        public Builder imageUrl(String imageUrl){this.imageUrl=imageUrl;return this;}
        public Builder veg(Boolean veg){this.veg=veg;return this;}
        public Builder available(Boolean available){this.available=available;return this;}
        public Builder prices(Map<String, Double> prices){this.prices=prices;return this;}

        public MenuRequest build(){
            return new MenuRequest(this);
        }
    }

    
    public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getCategoryId(){return categoryId;}
    public void setCategoryId(String categoryId){this.categoryId=categoryId;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

    public String getImageUrl(){return imageUrl;}
    public void setImageUrl(String imageUrl){this.imageUrl=imageUrl;}

    public Boolean getVeg(){return veg;}
    public void setVeg(Boolean veg){this.veg=veg;}

    public Boolean getAvailable(){return available;}
    public void setAvailable(Boolean available){this.available=available;}

    public Map<String, Double> getPrices(){return prices;}
    public void setPrices(Map<String, Double> prices){this.prices=prices;}
}