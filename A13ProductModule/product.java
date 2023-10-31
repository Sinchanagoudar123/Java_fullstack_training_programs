package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class product {
	
private int id;
private String name;
private float price;
public product() {
	super();
	// TODO Auto-generated constructor stub
}
public product (int id,String name,float price)
{
	super();
	this.id=id;
	this.name=name;
	this.price=price;
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
}

}
