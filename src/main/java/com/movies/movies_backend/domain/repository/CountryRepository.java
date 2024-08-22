package com.movies.movies_backend.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.movies.movies_backend.domain.entities.Country;

public interface CountryRepository extends CrudRepository<Country, Long>{

}

