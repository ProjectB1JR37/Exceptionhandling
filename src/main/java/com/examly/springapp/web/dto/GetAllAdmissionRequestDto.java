package com.examly.springapp.web.dto;

import javax.persistence.Column;

public class GetAllAdmissionRequestDto {

    //All Student Fields
    private long admissionId;
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
    private boolean accepted;
    private boolean denied;
    private boolean acceptedByStudent;
    private boolean deniedByStudent;

    //All Courses Field
    private long courseId;
    private String courseName;
    private String courseDescription;
    private String courseDuration;
    private String courseTiming;
    private String courseStudentCount;
    private String courseAcademicYear;
    private String courseRequiredPercentage;

    //All Institute Field :
    private String instituteName;
    private String instituteDescription;
    private String instituteCity;
    private String instituteState;
    private String instituteEmail;
    private String instituteMobile;
    private int nirfRank;

    public GetAllAdmissionRequestDto() {
    }

    public GetAllAdmissionRequestDto(long admissionId, String firstName, String lastName, String email, String mobile, String gender, String fatherName, String motherName, String age, String hscName, long hscMarks, String eligibility, boolean accepted, boolean denied, long courseId, String courseName, String courseDescription, String courseDuration, String courseTiming, String courseStudentCount, String courseAcademicYear, String courseRequiredPercentage, String instituteName, String instituteDescription, String instituteCity, String instituteState, String instituteEmail, String instituteMobile, int nirfRank) {
        this.admissionId = admissionId;
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
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
        this.courseTiming = courseTiming;
        this.courseStudentCount = courseStudentCount;
        this.courseAcademicYear = courseAcademicYear;
        this.courseRequiredPercentage = courseRequiredPercentage;
        this.instituteName = instituteName;
        this.instituteDescription = instituteDescription;
        this.instituteCity = instituteCity;
        this.instituteState = instituteState;
        this.instituteEmail = instituteEmail;
        this.instituteMobile = instituteMobile;
        this.nirfRank = nirfRank;
    }

    public GetAllAdmissionRequestDto(long admissionId, String firstName, String lastName, String email, String mobile, String gender, String fatherName, String motherName, String age, String hscName, long hscMarks, String eligibility, boolean accepted, boolean denied, boolean acceptedByStudent, boolean deniedByStudent, long courseId, String courseName, String courseDescription, String courseDuration, String courseTiming, String courseStudentCount, String courseAcademicYear, String courseRequiredPercentage, String instituteName, String instituteDescription, String instituteCity, String instituteState, String instituteEmail, String instituteMobile, int nirfRank) {
        this.admissionId = admissionId;
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
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
        this.courseTiming = courseTiming;
        this.courseStudentCount = courseStudentCount;
        this.courseAcademicYear = courseAcademicYear;
        this.courseRequiredPercentage = courseRequiredPercentage;
        this.instituteName = instituteName;
        this.instituteDescription = instituteDescription;
        this.instituteCity = instituteCity;
        this.instituteState = instituteState;
        this.instituteEmail = instituteEmail;
        this.instituteMobile = instituteMobile;
        this.nirfRank = nirfRank;
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

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseTiming() {
        return courseTiming;
    }

    public void setCourseTiming(String courseTiming) {
        this.courseTiming = courseTiming;
    }

    public String getCourseStudentCount() {
        return courseStudentCount;
    }

    public void setCourseStudentCount(String courseStudentCount) {
        this.courseStudentCount = courseStudentCount;
    }

    public String getCourseAcademicYear() {
        return courseAcademicYear;
    }

    public void setCourseAcademicYear(String courseAcademicYear) {
        this.courseAcademicYear = courseAcademicYear;
    }

    public String getCourseRequiredPercentage() {
        return courseRequiredPercentage;
    }

    public void setCourseRequiredPercentage(String courseRequiredPercentage) {
        this.courseRequiredPercentage = courseRequiredPercentage;
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
