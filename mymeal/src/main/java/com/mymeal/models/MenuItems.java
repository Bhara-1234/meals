package com.mymeal.models;

public class MenuItems {
	private int itemId;
	private String itemName;
	private double price;
	private int quantity;
	private String category;
	private String timing;

	// Constructors
	public MenuItems() {
		// Default constructor
	}

	public MenuItems(int itemId, String itemName, double price, int quantity, String category, String timing) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.timing = timing;
	}

	// Getter and Setter methods
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	@Override
	public String toString() {
		return "Item{" + "itemId=" + itemId + ", itemName='" + itemName + '\'' + ", price=" + price + ", quantity="
				+ quantity + ", category='" + category + '\'' + ", timing='" + timing + '\'' + '}';
	}
}
