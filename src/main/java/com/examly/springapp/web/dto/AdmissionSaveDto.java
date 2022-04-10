package com.examly.springapp.web.dto;

public class AdmissionSaveDto {

    private long userId;
    private long courseId;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String gender;
    private String fatherName;
    private String motherName;
    private String age;
    private String hscName;
    private long hscMarks;
    private String eligibility;

    public AdmissionSaveDto() {
    }

    public AdmissionSaveDto(long userId, long courseId, String firstName, String lastName, String email, String mobile, String gender, String fatherName, String motherName, String age, String hscName, long hscMarks, String eligibility) {
        this.userId = userId;
        this.courseId = courseId;
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
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
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
}
