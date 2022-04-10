package com.examly.springapp.model;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "institute")
public class Institute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instituteId")
    private long instituteId;
    @Column(name = "instituteName")
    private String instituteName;
    @Column(name = "instituteDescription")
    private String instituteDescription;
    @Column(name = "instituteCity")
    private String instituteCity;
    @Column(name = "instituteState")
    private String instituteState;
    @Email
    @Column(name = "instituteEmail")
    private String instituteEmail;
    @Column(name = "instituteMobile")
    private String instituteMobile;
    @Column(name = "nirfRank")
    private int nirfRank;

    public Institute() {
    }

    public Institute(String instituteName, String instituteDescription, String instituteCity, String instituteState, String instituteEmail, String instituteMobile, int nirfRank) {
        this.instituteName = instituteName;
        this.instituteDescription = instituteDescription;
        this.instituteCity = instituteCity;
        this.instituteState = instituteState;
        this.instituteEmail = instituteEmail;
        this.instituteMobile = instituteMobile;
        this.nirfRank = nirfRank;
    }

    public long getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(long instituteId) {
        this.instituteId = instituteId;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getInstituteDescription() {
        return instituteDescription;
    }

    public void setInstituteDescription(String instituteDescription) {
        this.instituteDescription = instituteDescription;
    }

    public String getInstituteCity() {
        return instituteCity;
    }

    public void setInstituteCity(String instituteCity) {
        this.instituteCity = instituteCity;
    }

    public String getInstituteState() {
        return instituteState;
    }

    public void setInstituteState(String instituteState) {
        this.instituteState = instituteState;
    }

    public String getInstituteEmail() {
        return instituteEmail;
    }

    public void setInstituteEmail(String instituteEmail) {
        this.instituteEmail = instituteEmail;
    }

    public String getInstituteMobile() {
        return instituteMobile;
    }

    public void setInstituteMobile(String instituteMobile) {
        this.instituteMobile = instituteMobile;
    }

    public int getNirfRank() {
        return nirfRank;
    }

    public void setNirfRank(int nirfRank) {
        this.nirfRank = nirfRank;
    }
}
