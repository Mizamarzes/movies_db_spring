package com.movies.movies_backend.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_country", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private Long idcountry;

    @NotNull(message = "")
    @Column(name = "name_country", columnDefinition = "VARCHAR(50)", nullable = false)
    private String nameCountry;

    @Embedded
    Audit audit = new Audit();

    public Country() {
    }

    public Long getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(Long idcountry) {
        this.idcountry = idcountry;
    }

    public String getNamecountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }
}
