package com.movies.movies_backend.domain.entities;

import java.sql.Blob;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    private Short idEmployee;

    @Column(columnDefinition = "VARCHAR(45)")
    private String firstname;

    @Column(columnDefinition = "VARCHAR(45)")
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "id_address", nullable = false)
    private Address address;

    @Lob
    @Column(name = "image")
    private Blob image;

    @OneToMany(mappedBy = "bossEmployee")
    private List<Warehouse> warehouse;
    
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean active;

    @Column(columnDefinition = "VARCHAR(16)")
    private String username;

    @Column(columnDefinition = "VARCHAR(40)")
    private String password;

    @Embedded
    Audit audit = new Audit();

    public Employee() {
    }

    public Short getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Short idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public List<Warehouse> getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(List<Warehouse> warehouse) {
        this.warehouse = warehouse;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
