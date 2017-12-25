package com.jaggu.spring.models;


public class Customer {

	private String name;
	private Integer custId;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(String name, Integer custId, String address) {
		super();
		this.name = name;
		this.custId = custId;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
