package com.examly.springapp.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;
    private String houseNumber;
    private String streetNumber;
    private String areaName;
    private String state;
    private String pinCode;
    private String nationality;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "admissionId",referencedColumnName = "admissionId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Admission admission;

    public Address() {
    }

    public Address(String houseNumber, String streetNumber, String areaName, String state, String pinCode, String nationality, Admission admission) {
        this.houseNumber = houseNumber;
        this.streetNumber = streetNumber;
        this.areaName = areaName;
        this.state = state;
        this.pinCode = pinCode;
        this.nationality = nationality;
        this.admission = admission;
    }

    public Address(long addressId, String houseNumber, String streetNumber, String areaName, String state, String pinCode, String nationality, Admission admission) {
        this.addressId = addressId;
        this.houseNumber = houseNumber;
        this.streetNumber = streetNumber;
        this.areaName = areaName;
        this.state = state;
        this.pinCode = pinCode;
        this.nationality = nationality;
        this.admission = admission;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Admission getAdmission() {
        return admission;
    }

    public void setAdmission(Admission admission) {
        this.admission = admission;
    }
}
