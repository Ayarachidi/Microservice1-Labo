package com.example.services;

import java.util.List;

import com.example.entities.Laboratoire;



public interface LaboratoireService {
	    List<Laboratoire> getAllLaboratoires();
	    Laboratoire saveLaboratoire(Laboratoire labo);
	    Laboratoire getLaboratoireById(Long id);
	    Long countLaboratoires();
	    void deleteLaboratoireById(Long id);
	    Laboratoire editLaboratoire(Laboratoire labo);
		List<Laboratoire> getActiveLaboratoires();
}
