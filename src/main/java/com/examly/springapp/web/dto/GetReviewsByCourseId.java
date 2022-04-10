package com.examly.springapp.web.dto;

import javax.persistence.Column;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class GetReviewsByCourseId {
    // Review Fields
    private long reviewId;
    private String message;
    private String starRating;

    //Course Details
    private long courseId;
    private String courseName;
    private String courseDescription;
    private String courseDuration;
    private String courseTiming;
    private String courseStudentCount;
    private String courseAcademicYear;

    //Intitute details

    private long instituteId;
    private String instituteName;
    private String instituteDescription;
    private String instituteCity;
    private String instituteState;
    private String instituteEmail;
    private String instituteMobile;
    private int nirfRank;

    // User Details

    private long userId;
    private String email;
    private String userName;
    private String userMobileNumber;

    public GetReviewsByCourseId() {
    }

    public GetReviewsByCourseId(long reviewId, String message, String starRating, long courseId, String courseName, String courseDescription, String courseDuration, String courseTiming, String courseStudentCount, String courseAcademicYear, long instituteId, String instituteName, String instituteDescription, String instituteCity, String instituteState, String instituteEmail, String instituteMobile, int nirfRank, long userId, String email, String userName, String userMobileNumber) {
        this.reviewId = reviewId;
        this.message = message;
        this.starRating = starRating;
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
        this.courseTiming = courseTiming;
        this.courseStudentCount = courseStudentCount;
        this.courseAcademicYear = courseAcademicYear;
        this.instituteId = instituteId;
        this.instituteName = instituteName;
        this.instituteDescription = instituteDescription;
        this.instituteCity = instituteCity;
        this.instituteState = instituteState;
        this.instituteEmail = instituteEmail;
        this.instituteMobile = instituteMobile;
        this.nirfRank = nirfRank;
        this.userId = userId;
        this.email = email;
        this.userName = userName;
        this.userMobileNumber = userMobileNumber;
    }

    public long getReviewId() {
        return reviewId;
    }

    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobileNumber() {
        return userMobileNumber;
    }

    public void setUserMobileNumber(String userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }
}
