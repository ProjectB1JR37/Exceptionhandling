package com.examly.springapp.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "courseId")
    private long courseId;
    @Column(name = "courseName")
    private String courseName;
    @Column(name = "courseDescription")
    private String courseDescription;
    @Column(name = "courseDuration")
    private String courseDuration;
    @Column(name = "courseTiming")
    private String courseTiming;
    @Column(name = "courseStudentCount")
    private String courseStudentCount;
    @Column(name = "courseAcademicYear")
    private String courseAcademicYear;
    @Column(name = "courseRequiredPercentage")
    private String courseRequiredPercentage;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "instituteId",referencedColumnName = "instituteId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Institute institute;

    public Courses() {
    }

    public Courses(long courseId, String courseName, String courseDescription, String courseDuration, String courseTiming, String courseStudentCount, String courseAcademicYear, String courseRequiredPercentage, Institute institute) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
        this.courseTiming = courseTiming;
        this.courseStudentCount = courseStudentCount;
        this.courseAcademicYear = courseAcademicYear;
        this.courseRequiredPercentage = courseRequiredPercentage;
        this.institute = institute;
    }

    public Courses(String courseName, String courseDescription, String courseDuration, String courseTiming, String courseStudentCount, String courseAcademicYear, String courseRequiredPercentage, Institute institute) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
        this.courseTiming = courseTiming;

        this.courseStudentCount = courseStudentCount;
        this.courseAcademicYear = courseAcademicYear;
        this.courseRequiredPercentage = courseRequiredPercentage;
        this.institute = institute;
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

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }
}
