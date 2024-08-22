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
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address",columnDefinition = "SMALLINT UNSIGNED",nullable = false)
    private Long idAddress;

    @Column(columnDefinition = "VARCHAR(50)",nullable=false)
    private String address;

    @Column(columnDefinition = "VARCHAR(50)")
    private String address2;

    @Column(columnDefinition = "VARCHAR(20)")
    private String district;

    @ManyToOne
    @JoinColumn(name="id_city",nullable = false)
    private City ciudad;

    @Column(name = "postal_code", columnDefinition = "VARCHAR(10)")
    private String postalCode;

    @Column(columnDefinition = "VARCHAR(20)")
    private String phone;

    // @Column(name = "last_update",columnDefinition = "TIMESTAMP")
    // private Timestamp lastUpdate;

    @Embedded
    Audit audit = new Audit();

    public Address() {
    }

    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public City getCiudad() {
        return ciudad;
    }

    public void setCiudad(City ciudad) {
        this.ciudad = ciudad;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
