package com.example.services;

import java.util.List;

import com.example.entities.ContactLaboratoire;
import com.example.entities.Laboratoire;

public interface ContactLaboratoireService {
	    List<ContactLaboratoire> getAllContactLaboratoires();
	    ContactLaboratoire saveContactLaboratoire(ContactLaboratoire contactLaboratoire);
	    ContactLaboratoire getContactLaboratoireById(Long id);
	    Long countContactLaboratoires();
	    void deleteContactLaboratoireById(Long id);
	    ContactLaboratoire editContactLaboratoire(ContactLaboratoire contactLaboratoire);
		List<ContactLaboratoire> getActiveContactLaboratoires();
}
