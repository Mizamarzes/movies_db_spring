package com.movies.movies_backend.domain.entities;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @Column(name = "id_ciudad", columnDefinition = "SMALLINT UNSIGNED", nullable = true)
    private Long id_ciudad;

    @Column(name = "nombre", columnDefinition = "VARCHAR(50)", nullable = true)
    private String nombreciudad;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    @Column(name = "ultima_actualizacion", columnDefinition = "TIMESTAMP", nullable = true)
    private Timestamp ultima_actualizacion_ciudad;

    public Ciudad() {
    }

    public Ciudad(Long id_ciudad, String nombreciudad, Timestamp ultima_actualizacion_ciudad) {
        this.id_ciudad = id_ciudad;
        this.nombreciudad = nombreciudad;
        this.ultima_actualizacion_ciudad = ultima_actualizacion_ciudad;
    }

    public Long getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(Long id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombreciudad() {
        return nombreciudad;
    }

    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }

    public Timestamp getUltima_actualizacion_ciudad() {
        return ultima_actualizacion_ciudad;
    }

    public void setUltima_actualizacion_ciudad(Timestamp ultima_actualizacion_ciudad) {
        this.ultima_actualizacion_ciudad = ultima_actualizacion_ciudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

       

}
