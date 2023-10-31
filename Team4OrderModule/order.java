package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="orders")
public class Order {
private int id;
private int cost;
private String product;



public Order() {
	super();
	
}
public Order(int id,int cost, String product) {
	super();
	this.id = id;
	this.cost = cost;
	this.product = product;
	
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}

@Override
public String toString() {
	return "Order [id=" + id + ", cost=" + cost + ", product="
			+ product + "]";
}

}
