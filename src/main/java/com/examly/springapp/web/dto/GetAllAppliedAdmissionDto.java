package com.examly.springapp.web.dto;

public class GetAllAppliedAdmissionDto {
    //All Student field
    private long admissionId;
    private boolean accepted;
    private boolean denied;
    // All Course Field :
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

    public GetAllAppliedAdmissionDto() {
    }

    public GetAllAppliedAdmissionDto(long admissionId, boolean accepted, boolean denied, long courseId, String courseName, String courseDescription, String courseDuration, String courseTiming, String courseStudentCount, String courseAcademicYear, String courseRequiredPercentage, String instituteName, String instituteDescription, String instituteCity, String instituteState, String instituteEmail, String instituteMobile, int nirfRank) {
        this.admissionId = admissionId;
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

    public long getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(long studentId) {
        this.admissionId = studentId;
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
