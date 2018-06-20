package com.theresa.dojoninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.theresa.dojoninjas.models.Ninja;
import com.theresa.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepository.findAll();
	}
}
