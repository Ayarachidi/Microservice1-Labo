package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.*;
@RepositoryRestResource
public interface ContactLaboratoireRepository extends JpaRepository<ContactLaboratoire,Long> {
	List<ContactLaboratoire> findByIsActiveTrue();

}
