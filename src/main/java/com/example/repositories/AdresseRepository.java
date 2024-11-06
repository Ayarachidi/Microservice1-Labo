package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.Adresse;
@RepositoryRestResource
public interface AdresseRepository extends JpaRepository<Adresse,Long>{
	List<Adresse> findByIsActiveTrue();
}