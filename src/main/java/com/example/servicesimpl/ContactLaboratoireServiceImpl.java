package com.example.servicesimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.ContactLaboratoire;
import com.example.repositories.ContactLaboratoireRepository;
import com.example.services.ContactLaboratoireService;

@Service
public class ContactLaboratoireServiceImpl implements  ContactLaboratoireService{
    private ContactLaboratoireRepository contactlaborep;
    
	public ContactLaboratoireServiceImpl(ContactLaboratoireRepository contactlaborep) {
		super();
		this.contactlaborep = contactlaborep;
	}

	@Override
	public List<ContactLaboratoire> getAllContactLaboratoires() {
		// TODO Auto-generated method stub
		return contactlaborep.findAll();
	}

	@Override
	public ContactLaboratoire saveContactLaboratoire(ContactLaboratoire contactLaboratoire) {
		// TODO Auto-generated method stub
		return contactlaborep.save(contactLaboratoire);
	}

	@Override
	public ContactLaboratoire getContactLaboratoireById(Long id) {
		// TODO Auto-generated method stub
		return contactlaborep.getById(id);
	}

	@Override
	public Long countContactLaboratoires() {
		// TODO Auto-generated method stub
		return contactlaborep.count();
	}

	@Override
	public void deleteContactLaboratoireById(Long id) {
		// TODO Auto-generated method stub
		contactlaborep.deleteById(id);
	}

	@Override
	public ContactLaboratoire editContactLaboratoire(ContactLaboratoire contactLaboratoire) {
		// TODO Auto-generated method stub
		return contactlaborep.save(contactLaboratoire);
	}

	@Override
	public List<ContactLaboratoire> getActiveContactLaboratoires() {
		// TODO Auto-generated method stub
		return contactlaborep.findByIsActiveTrue();
	}

}
