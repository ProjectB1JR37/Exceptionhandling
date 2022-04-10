package com.examly.springapp.web.dto;

public interface GetAllCoursesDto {
     long getCourseId();
     String getCourseAcademicYear();
    String getCourseDescription();
    String getCourseDuration();
    String getCourseName();
    String getCourseRequiredPercentage();

    String getCourseStudentCount();
    String getCourseTiming();
    long getInstituteId();
}
