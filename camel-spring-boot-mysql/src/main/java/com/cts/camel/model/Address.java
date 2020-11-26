package com.cts.camel.model;

public class Address {
	private String street;
	private String streetName;
	private String buildingNumber;
	private String city;
	private String zipcode;
	private String country;
	private String countryCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String streetName, String buildingNumber, String city, String zipcode, String country,
			String countryCode) {
		super();
		this.street = street;
		this.streetName = streetName;
		this.buildingNumber = buildingNumber;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
		this.countryCode = countryCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getBuildingNumber() {
		return buildingNumber;
	}
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", streetName=" + streetName + ", buildingNumber=" + buildingNumber
				+ ", city=" + city + ", zipcode=" + zipcode + ", country=" + country + ", countryCode=" + countryCode
				+ "]";
	}
	
}