package com.movies.movies_backend.domain.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.movies.movies_backend.domain.entities.Country;

public interface CountryService {
    Page<Country> findAll(Pageable pageable);
    Optional<Country> findById(Long id);
    Country save(Country country);
    Country update(Long id);
    Optional<Country> delete(Long id);
}
