package com.MongoDB.Trial;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("details")
public class Employee {


@Id
int id;
String name;
String city;
String country;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

	 
}
