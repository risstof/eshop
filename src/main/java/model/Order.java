package model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Order {
	
	@Id
	Integer id;
	String orderName;
	String description;
	String clientLogin;
	String clientName;
	String orderStatus;
	String orderedBy;
	Date dateFrom;
	Date dateTo;
	String PaymentsType;
	
	@ManyToMany
	Set<Customer> customerOrder;

}
