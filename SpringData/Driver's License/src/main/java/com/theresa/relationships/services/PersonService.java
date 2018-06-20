package com.theresa.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.theresa.relationships.models.Person;
import com.theresa.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	// Create new person.
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}
	
	// Retrieve all person records.
	public List<Person> allPersons() {
		return personRepository.findAll();
	}
	
	public List<Person> findByLicenseIsNull() {
		return personRepository.findByLicenseIsNull();
	}
}
