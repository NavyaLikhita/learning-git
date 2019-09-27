package com.cg.springmvcdemo.dto;

public class Product {
	private Integer productId;
	private String productName;
	private Double productCost;
	private String productFeatures;
	private String productType;
	private String online;

	public Product(Integer productId, String productName, Double productCost, String productfeatures,
			String productType, String online) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.productFeatures = productfeatures;
		this.productType = productType;
		this.online = online;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductCost() {
		return productCost;
	}

	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}

	public String getProductfeatures() {
		return productFeatures;
	}

	public void setProductfeatures(String productfeatures) {
		this.productFeatures = productfeatures;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", productfeatures=" + productFeatures + ", productType=" + productType + ", online=" + online + "]";
	}


}
