package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {

	@Id
	String id;
	String country;
	String postalCode;
	String city;
	String street;
	String streetNumber;
	Integer house;
	
}
