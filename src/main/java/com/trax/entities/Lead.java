package com.trax.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="leads")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	@Column(name = "first_name",length =45)
	private String firstName;
	@Column(nullable = false,length =45,name= "last_name")
	private String lastName;
	@Column(name ="lead_source")
	private String leadSource;
	@Column(unique = true,length =128, nullable=false,name="email")
	private String email;
	@Column(length =10, unique =true,nullable =false)
	private long mobile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLeadSource() {
		return leadSource;
	}
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
}
