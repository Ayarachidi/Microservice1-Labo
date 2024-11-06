package com.example.servicesimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.Adresse;
import com.example.repositories.AdresseRepository;
import com.example.services.AdresseService;

@Service
public class AdresseServiceImpl implements AdresseService {
	private AdresseRepository   adresserep;
	

	public AdresseServiceImpl(AdresseRepository adresserep) {
		super();
		this.adresserep = adresserep;
	}

	@Override
	public List<Adresse> getAllAdresses() {
		
		return adresserep.findAll();
	}

	@Override
	public Adresse saveAdresse(Adresse adresse) {
		
		return adresserep.save(adresse);
	}

	@Override
	public Adresse getAdresseById(Long id) {

		return adresserep.getById(id);
	}

	@Override
	public Long countAdresses() {
		
		return adresserep.count();
	}

	@Override
	public void deleteAdresseById(Long id) {
		adresserep.deleteById(id);
		
	}

	@Override
	public Adresse editAdresse(Adresse adresse) {
		
		return adresserep.save(adresse);
	}
	@Override
	public List<Adresse> getActiveAdresses() {
        return adresserep.findByIsActiveTrue();
    }
}
