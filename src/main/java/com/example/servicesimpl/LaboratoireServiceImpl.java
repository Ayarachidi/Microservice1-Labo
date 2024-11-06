package com.example.servicesimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.*;
import com.example.repositories.*;
import com.example.services.LaboratoireService;
@Service
public class LaboratoireServiceImpl implements LaboratoireService {
	private LaboratoireRepository   laborep;
	

	public LaboratoireServiceImpl(LaboratoireRepository laborep) {
		super();
		this.laborep = laborep;
	}


	@Override
	public List<Laboratoire> getAllLaboratoires() {
		
		return laborep.findAll();
	}


	@Override
	public Laboratoire saveLaboratoire(Laboratoire labo) {
		
		return laborep.save(labo);
	}


	@Override
	public Laboratoire getLaboratoireById(Long id) {
		// TODO Auto-generated method stub
		return laborep.getById(id);
	}


	@Override
	public Long countLaboratoires() {
		// TODO Auto-generated method stub
		return laborep.count();
	}


	@Override
	public void deleteLaboratoireById(Long id) {
		// TODO Auto-generated method stub
		laborep.deleteById(id);
	}


	@Override
	public Laboratoire editLaboratoire(Laboratoire labo) {
		// TODO Auto-generated method stub
		return laborep.save(labo);
	}


	@Override
	public List<Laboratoire> getActiveLaboratoires() {
		return laborep.findByIsActiveTrue();
	}

}
