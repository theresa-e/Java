package com.theresa.waterbnb.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.theresa.waterbnb.models.Listing;

public interface ListingRepository extends CrudRepository<Listing, Long>{
	List<Listing> findAll();
}
