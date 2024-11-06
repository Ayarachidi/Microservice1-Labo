package com.example.services;

import java.util.List;

import com.example.entities.Adresse;
public interface AdresseService {
	    List<Adresse> getAllAdresses();
	    Adresse saveAdresse(Adresse adresse);
	    Adresse getAdresseById(Long id);
	    Long countAdresses();
	    void deleteAdresseById(Long id);
	    Adresse editAdresse(Adresse adresse);
		List<Adresse> getActiveAdresses();
}
