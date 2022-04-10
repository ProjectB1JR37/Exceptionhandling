package com.examly.springapp.service;


import com.examly.springapp.web.dto.CourseSaveDto;
import com.examly.springapp.model.Courses;
import com.examly.springapp.web.dto.GetAllCoursesAdminDto;
import com.examly.springapp.web.dto.GetAllCoursesDto;
import com.examly.springapp.web.dto.ViewCourseDto;

import java.util.List;

public interface CoursesService {
    
    Courses saveCourse(CourseSaveDto courseSaveDto);

    List<GetAllCoursesDto> getAllCourses(Long instituteId);

    List<GetAllCoursesAdminDto> getAllCourses();

    ViewCourseDto getCourseById(long id);

    void editCourse(long id, CourseSaveDto dto);

    void deleteCourse(long id);

	//List<GetAllCoursesDto> getAllCourses(Long instituteId);
}
