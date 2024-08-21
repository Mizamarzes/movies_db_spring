package com.movies.movies_backend.domain.entities;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @Column(name = "id_pais", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private Long idpais;

    @Column(name = "nombre", columnDefinition = "VARCHAR(50)", nullable = false)
    private String namepais;

    @Column(name = "ultima_actualizacion", columnDefinition = "TIMESTAMP", nullable = false)
    private Timestamp ultima_actualizacion_pais;

    @OneToMany(mappedBy = "pais")
    private List<Ciudad> ciudades;

    public Pais() {
    }

    public Long getIdpais() {
        return idpais;
    }

    public void setIdpais(Long idpais) {
        this.idpais = idpais;
    }

    public String getNamepais() {
        return namepais;
    }

    public void setNamepais(String namepais) {
        this.namepais = namepais;
    }

    public Timestamp getUltima_actualizacion_pais() {
        return ultima_actualizacion_pais;
    }

    public void setUltima_actualizacion_pais(Timestamp ultima_actualizacion_pais) {
        this.ultima_actualizacion_pais = ultima_actualizacion_pais;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    
}
