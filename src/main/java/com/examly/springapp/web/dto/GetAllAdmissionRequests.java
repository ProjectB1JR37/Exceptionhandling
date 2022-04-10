package com.examly.springapp.web.dto;

import com.examly.springapp.model.Courses;
import com.examly.springapp.model.User;

public interface GetAllAdmissionRequests {
    long getAdmissionId();
    String getFirstName();
    String getLastName();
    String getEmail();
    String getMobile();
    String getGender();
    String getFatherName();
    String getMotherName();
    String getAge();
    String getHscName();
    long getHscMarks();
    String getEligibility();
    boolean getAccepted();
    boolean getDenied();
    boolean getAcceptedByStudent();
    boolean getDeniedByStudent();
    long getUserId();
    long getCourseId();
}
