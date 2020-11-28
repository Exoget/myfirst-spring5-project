package com.packt.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.packt.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}