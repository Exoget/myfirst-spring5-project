package com.packt.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.packt.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
	// si j'aoute une mdethode ici ca va poser des problemes car on va utiliser l'implimentation par defaut
	// SimpleJpaRepository qui ne contient pas la methode qui sera ajouté nromalement
}