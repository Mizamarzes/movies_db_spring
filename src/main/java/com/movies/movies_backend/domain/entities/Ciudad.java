package com.movies.movies_backend.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudad")
public class Ciudad {

    @Id
    @Column(name = "id_ciudad", columnDefinition = "SMALLINT UNSIGNED", nullable = true)
    private int id_ciudad;

    @Column(name = "nombre", columnDefinition = "VARCHAR(50)", nullable = true)
    private String nombreciudad;

    public Ciudad() {
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombreciudad() {
        return nombreciudad;
    }

    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }

        

}
