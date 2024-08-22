package com.movies.movies_backend.domain.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movies.movies_backend.domain.entities.Country;
import com.movies.movies_backend.domain.repository.CountryRepository;
import com.movies.movies_backend.domain.service.CountryService;

@Service
public class PaisImpl implements CountryService {

    @Autowired
    private CountryRepository paisRepository;

    @Transactional
    @Override
    public Page<Country> findAll(Pageable pageable){
        return (Page<Country>) paisRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Country> findById(Long id) {
        return paisRepository.findById(id);
    }

    @Transactional
    @Override
    public Country save(Country pais) {
        return paisRepository.save(pais);
    }

    @Override
    public Country update(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Optional<Country> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    // @Transactional
    // @Override
    // public Optional<Pais> delete(Long id) {
    //     Optional<Pais> paisOpt = paisRepository.findById(id);
    //     paisOpt.ifPresent(paisItem -> {
    //         paisRepository.delete(paisItem);
    //     });
    //     return paisOpt;
    // }

    // @Override
    // public Optional<Pais> update(Long id, Pais pais) {
    //     Optional<Pais> paisOpt = paisRepository.findById(id);
    //     if (paisOpt.isPresent()) {
    //         Pais paisItem = paisOpt.orElseThrow();
    //         paisItem.setNamepais(pais.getNamepais());
    //         paisItem.setCiudades(pais.getCiudades());
    //         paisItem.setUltima_actualizacion_pais(pais.getUltima_actualizacion_pais());

    //         return Optional.of(paisRepository.save(paisItem));
    //     }
    //     return paisOpt;
    // }

}
