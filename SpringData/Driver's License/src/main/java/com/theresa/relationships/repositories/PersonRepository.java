package com.theresa.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.theresa.relationships.models.Person;

@Repository
public interface PersonRepository extends CrudRepository <Person, Long> {
	// Find all person records
	List<Person> findAll();
	List<Person> findByLicenseIsNull();
}
