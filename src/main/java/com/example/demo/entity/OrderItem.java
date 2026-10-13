package com.example.demo.entity;


public class OrderItem {

    private String menuItemId;
    private String itemName;
    private String size;
    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
	public String getMenuItemId() {
		return menuItemId;
	}
	public void setMenuItemId(String menuItemId) {
		this.menuItemId = menuItemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
