package com.movies.movies_backend.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_city", columnDefinition = "SMALLINT UNSIGNED", nullable = true)
    private Long id_city;

    @Column(name = "name_city", columnDefinition = "VARCHAR(50)", nullable = true)
    private String nameCity;

    @ManyToOne
    @JoinColumn(name = "id_country",nullable = false)
    private Country country;

    @Embedded
    Audit audit = new Audit();

    public City() {
    }

    public Long getid_city() {
        return id_city;
    }

    public void setid_city(Long id_city) {
        this.id_city = id_city;
    }

    public String getnameCity() {
        return nameCity;
    }

    public void setnameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Country getCountry() {
        return country;
    }

    public void setPais(Country country) {
        this.country = country;
    }

}
