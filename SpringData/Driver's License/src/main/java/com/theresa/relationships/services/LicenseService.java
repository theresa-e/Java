package com.theresa.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.theresa.relationships.models.License;
import com.theresa.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;
	
	// Dependency injection
	public LicenseService (LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	// Get all licenses
	 public List<License> allLicenses() {
		 return licenseRepository.findAll();
	 }
	 
	 // Create license
	 public License createLicense(License license) {
		 return licenseRepository.save(license);
	 }
}
        