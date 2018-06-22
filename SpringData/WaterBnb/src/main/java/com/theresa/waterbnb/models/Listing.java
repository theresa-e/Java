package com.theresa.waterbnb.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="listings")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String address;
    @NonNull
    private String poolSize;
    @NonNull
    private Double price;
    @NonNull
    private String description;

    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    // Join for reviews/ratings
    @OneToMany(mappedBy="listing", fetch = FetchType.LAZY)
    private List<ListingUser> listingUser; // Reference middle join table
    
    // Join for host / user.
    // One listing can have one host, but one host can have many listings. 
    @ManyToOne(fetch = FetchType.LAZY)
    private User host;
    
    public Listing() {
    }
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPoolSize() {
		return poolSize;
	}

	public void setPoolSize(String poolSize) {
		this.poolSize = poolSize;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public User getHost() {
		return this.host;
	}
	
	public void setHost(User user) {
		this.host = user;
	}
	@PrePersist
	void createdAt() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	void updatedAt() {
		this.updatedAt = new Date();
	}

}
