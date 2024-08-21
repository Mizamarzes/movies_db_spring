package com.movies.movies_backend.domain.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.movies.movies_backend.domain.entities.Pais;

public interface PaisService {
    Page<Pais> findAll(Pageable pageable);
    Optional<Pais> findById(Long id);
    Pais save(Pais pais);
    Pais update(Long id);
    Optional<Pais> delete(Long id);
}
