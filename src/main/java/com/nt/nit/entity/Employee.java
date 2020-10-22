package com.nt.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//entity and table is for dataipa for oracle and mysql
//@Entity
//@Table(name="Employees_Data")
@Document(collection="Emp")
public class Employee {
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
	//@Column(name="first_name")
private String firstName;
	//@Column(name="last_name")
private String lastName;
	//@Column(name="email_id")
private String emailId;

}
