package com.theresa.waterbnb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.theresa.waterbnb.models.Listing;
import com.theresa.waterbnb.repositories.ListingRepository;

@Service
public class ListingService {
	private final ListingRepository listingRepository;
	
	public ListingService(ListingRepository listingRepository) {
		this.listingRepository = listingRepository;
	}
	
	// Return a list of all listings.
	public List<Listing> allListings(){
		return listingRepository.findAll();
	}
	
	public Listing createListing(Listing listing) {
		return listingRepository.save(listing);
	}
}
