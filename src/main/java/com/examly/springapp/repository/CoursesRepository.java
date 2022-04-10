package com.examly.springapp.repository;
import com.examly.springapp.constants.Constants;
import com.examly.springapp.model.Courses;
import com.examly.springapp.web.dto.GetAllCoursesDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CoursesRepository extends JpaRepository<Courses,Long> {

   /* @Query(value = "select course_id as courseId, course_academic_year as courseAcademicYear,course_description as courseDescription,course_duration as courseDuration, course_name as courseName, course_required_percentage as courseRequiredPercentage, course_student_count as courseStudentCount, course_timing as courseTiming, institute_id as instituteId from courses where course_id= :id ",nativeQuery = true)
    GetAllCoursesDto findByCourseId(@Param("id") long id);*/

    Courses findByCourseId(@Param(Constants.ID) long id);

    @Query(value =Constants.GET_ALL_COURSES_WITH_INSTITUTE_ID_QUERY ,nativeQuery = true)
    List<GetAllCoursesDto> getAllCourses(@Param(Constants.INSTITUTE_ID) long instituteId);

    @Query(value = Constants.GET_ALL_COURSES_QUERY,nativeQuery = true)
    List<GetAllCoursesDto> getAllCourses();

    @Modifying
    @Transactional
    @Query(value = Constants.EDIT_COURSE_BY_ID_QUERY,nativeQuery = true)
    void editCourseById(long id,String courseName, String courseDescription, String courseDuration, String courseTiming, String courseStudentCount, String courseAcademicYear, String courseRequiredPercentage);

    @Modifying
    @Transactional
    @Query(value = Constants.DELETE_COURSE_BY_ID_QUERY,nativeQuery = true)
    void deleteCourseById(long id);
}
