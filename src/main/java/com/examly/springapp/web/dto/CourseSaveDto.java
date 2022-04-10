package com.examly.springapp.web.dto;

public class CourseSaveDto {
    private Long instituteId;
    private String courseName;
    private String courseDescription;
    private String courseDuration;
    private String courseTiming;
    private String courseStudentCount;
    private String courseAcademicYear;
    private String courseRequiredPercentage;

    public CourseSaveDto() {
    }

    public CourseSaveDto(Long instituteId, String courseName, String courseDescription, String courseDuration, String courseTiming, String courseStudentCount, String courseAcademicYear, String courseRequiredPercentage) {
        this.instituteId = instituteId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
        this.courseTiming = courseTiming;
        this.courseStudentCount = courseStudentCount;
        this.courseAcademicYear = courseAcademicYear;
        this.courseRequiredPercentage = courseRequiredPercentage;
    }

    public Long getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(Long instituteId) {
        this.instituteId = instituteId;
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
}
