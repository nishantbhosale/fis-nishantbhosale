package com.example.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	int customer_id;
	@Column
	String customer_name;
	@Column
	long contact_no;
	@Column
	String contact_add;
	@Column
	String date;
	@Column
	int age;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int customer_id, String customer_name, long contact_no, String contact_add, String date, int age) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.contact_no = contact_no;
		this.contact_add = contact_add;
		this.date = date;
		this.age = age;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getContact_add() {
		return contact_add;
	}
	public void setContact_add(String contact_add) {
		this.contact_add = contact_add;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
