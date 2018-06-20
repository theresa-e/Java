package com.theresa.relationships.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
@Table(name="license")
public class License {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long Id;
		@Size(min=6)
		@GeneratedValue
		private String number;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date expiration_date;
		@Size(min=2, max=2)
		private String state;
		@Column(updatable=false)
		private Date createdAt;
		private Date updatedAt;
		@OneToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="person_id")
		private Person person;
		public License() {
			
		}
		
		public Long getId() {
			return Id;
		}
		
		public void setId(Long id) {
			Id = id;
		}
		
		public String getNumber() {
			return number;
		}
		
		public void setNumber(String number) {
			this.number = number;
		}
		
		public Date getExpiration_date() {
			return expiration_date;
		}
		
		public void setExpiration_date(Date expiration_date) {
			this.expiration_date = expiration_date;
		}
		
		public String getState() {
			return state;
		}
		
		public void setState(String state) {
			this.state = state;
		}

		public Person getPerson() {
			return person;
		}
		
		public void setPerson(Person person) {
			this.person = person;
		}
		
		@PrePersist
		protected void onCreate() {
			this.createdAt = new Date();
		}
		
		@PreUpdate
		protected void onUpdate() {
			this.updatedAt = new Date();
		}
		
}
