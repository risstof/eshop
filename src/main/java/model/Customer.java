package model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	
	@Id
	Integer id;
	String customerName;
	String customerLogin;
	String customerNotice;
	String storeNotice;
	@ManyToMany
	Set<Order> orderCustomer;
	
}
