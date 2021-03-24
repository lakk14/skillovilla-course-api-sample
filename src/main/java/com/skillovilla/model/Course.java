package com.skillovilla.model;

public class Course {

	private String id;
	private String name;
	private String shortDescription;
	private String longDescription;
	private double rating;
	private String thumbnailIconPath;
	private String courseBannerPath;
	private String tagId;
	private double costPrice;
	private double sellingPrice;
	private boolean offerStatus;
	private String currencyCode;
	private String pricingType;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String id, String name, String shortDescription, String longDescription, double rating,
			String thumbnailIconPath, String courseBannerPath, String tagId, double costPrice, double sellingPrice,
			boolean offerStatus, String currencyCode, String pricingType) {
		super();
		this.id = id;
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.rating = rating;
		this.thumbnailIconPath = thumbnailIconPath;
		this.courseBannerPath = courseBannerPath;
		this.tagId = tagId;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.offerStatus = offerStatus;
		this.currencyCode = currencyCode;
		this.pricingType = pricingType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getThumbnailIconPath() {
		return thumbnailIconPath;
	}

	public void setThumbnailIconPath(String thumbnailIconPath) {
		this.thumbnailIconPath = thumbnailIconPath;
	}

	public String getCourseBannerPath() {
		return courseBannerPath;
	}

	public void setCourseBannerPath(String courseBannerPath) {
		this.courseBannerPath = courseBannerPath;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public void setCostPrice(float costPrice) {
		this.costPrice = costPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public boolean isOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(boolean offerStatus) {
		this.offerStatus = offerStatus;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getPricingType() {
		return pricingType;
	}

	public void setPricingType(String pricingType) {
		this.pricingType = pricingType;
	}

}
