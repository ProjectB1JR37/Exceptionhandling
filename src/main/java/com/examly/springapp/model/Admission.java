package com.examly.springapp.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "admission")
public class Admission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admissionId")
    private long admissionId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "gender")
    private String gender;
    @Column(name = "fatherName")
    private String fatherName;
    @Column(name = "motherName")
    private String motherName;
    @Column(name = "age")
    private String age;
    @Column(name = "hscName")
    private String hscName;
    @Column(name = "hscMarks")
    private long hscMarks;
    @Column(name = "eligibility")
    private String eligibility;
    @Column(name = "accepted")
    private boolean accepted;
    @Column(name = "denied")
    private boolean denied;
    @Column(name = "acceptedByStudent")
    private boolean acceptedByStudent;
    @Column(name = "deniedByStudent")
    private boolean deniedByStudent;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "userId",referencedColumnName = "userId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @OneToOne
    @JoinColumn(name = "courseId", referencedColumnName = "courseId")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Courses course;

    public Admission() {
    }

    public Admission(String firstName, String lastName, String email, String mobile, String gender, String fatherName, String motherName, String age, String hscName, long hscMarks, String eligibility, boolean accepted, boolean denied, boolean acceptedByStudent, boolean deniedByStudent, User user, Courses course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.age = age;
        this.hscName = hscName;
        this.hscMarks = hscMarks;
        this.eligibility = eligibility;
        this.accepted = accepted;
        this.denied = denied;
        this.acceptedByStudent = acceptedByStudent;
        this.deniedByStudent = deniedByStudent;
        this.user = user;
        this.course = course;
    }



    public long getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(long admissionId) {
        this.admissionId = admissionId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHscName() {
        return hscName;
    }

    public void setHscName(String hscName) {
        this.hscName = hscName;
    }

    public long getHscMarks() {
        return hscMarks;
    }

    public void setHscMarks(long hscMarks) {
        this.hscMarks = hscMarks;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isDenied() {
        return denied;
    }

    public void setDenied(boolean denied) {
        this.denied = denied;
    }

    public boolean isAcceptedByStudent() {
        return acceptedByStudent;
    }

    public void setAcceptedByStudent(boolean acceptedByStudent) {
        this.acceptedByStudent = acceptedByStudent;
    }

    public boolean isDeniedByStudent() {
        return deniedByStudent;
    }

    public void setDeniedByStudent(boolean deniedByStudent) {
        this.deniedByStudent = deniedByStudent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }
}
