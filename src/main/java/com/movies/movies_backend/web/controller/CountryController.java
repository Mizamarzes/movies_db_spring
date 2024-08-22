package com.movies.movies_backend.web.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.movies_backend.domain.entities.Country;
import com.movies.movies_backend.domain.service.CountryService;


@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ResponseEntity<Page<Country>> listPaises(Pageable pageable){
        
        Page<Country> paisPage = countryService.findAll(pageable);

        if(paisPage.hasContent()){
            return ResponseEntity.ok(paisPage);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> view(@PathVariable Long id) {
        Optional<Country> paisOpt = countryService.findById(id);
        if (paisOpt.isPresent()) {
            return ResponseEntity.ok(paisOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Country> create(@RequestBody Country country){
        Country countryNew = countryService.save(country);
        return ResponseEntity.status(HttpStatus.CREATED).body(countryNew);
    }
    
    // @PutMapping("/{id}")
    // public ResponseEntity<Country> update(@PathVariable Long id, @RequestBody Country country){
    //     Optional<Country> countryOpt = countryService.update(id, country);
    //     if (countryOpt.isPresent()) {
    //         return ResponseEntity.status(HttpStatus.CREATED).body(countryOpt.orElseThrow());
    //     }
    //     return ResponseEntity.notFound().build();
    // }

    @DeleteMapping("/{id}")
    public ResponseEntity<Country> delete(@PathVariable Long id){
        Country country = new Country();
        country.setIdcountry(id);
        Optional<Country> countryOpt = countryService.delete(id);
        if (countryOpt.isPresent()) {
            return ResponseEntity.ok(countryOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

}
