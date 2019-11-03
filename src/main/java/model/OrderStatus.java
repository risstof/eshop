package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderStatus {
	
	@Id
	Integer id;
	String status;
	String description;

}
