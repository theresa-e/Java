package com.theresa.waterbnb.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Size(min=2, message="Please enter a valid name")
	private String firstName;
	private String lastName;
    @Email(message="Email must be valid")
	private String email;
    @Size(min=5, message="Password must be greater than 5 characters")
	private String password;
    private String acctType;
	@Transient
	private String passwordConfirmation;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	// Join for ratings/reviews
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private List<ListingUser> listingUser; // Reference middle join table

    // Join for BnBs created. **Only applies to users who are host!**
    // ONE host can have MANY listings.
    @OneToMany(mappedBy="host", fetch = FetchType.LAZY)
    private List<Listing> listings;
    
	public User() {
	}
 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}


	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	public String getAcctType() {
		return acctType;
	}


	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	
	public List<Listing> getListings(){
		return this.listings;
	}
	
	public void setListings(List<Listing> listings) {
		this.listings = listings;
	}
	
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}
}
