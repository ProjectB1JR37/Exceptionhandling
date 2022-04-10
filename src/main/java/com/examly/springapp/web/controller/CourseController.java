package com.examly.springapp.web.controller;

import com.examly.springapp.model.Courses;
import com.examly.springapp.service.CoursesService;
import com.examly.springapp.web.dto.CourseSaveDto;
import com.examly.springapp.web.dto.GetAllCoursesAdminDto;

import com.examly.springapp.constants.Constants;
import com.examly.springapp.web.dto.GetAllCoursesDto;
import com.examly.springapp.web.dto.ViewCourseDto;
import exception.ResourceNotFound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class CourseController {
    @Autowired
    CoursesService coursesService;


    @PostMapping(Constants.ADD_COURSE_URL_MAPPING)
    @ResponseBody
    public ResponseEntity<?> addCourse(@RequestBody CourseSaveDto courseSaveDto){

    		Courses c= coursesService.saveCourse(courseSaveDto);
    		return new ResponseEntity<Courses>(c,HttpStatus.CREATED);


    }

    
    @GetMapping(Constants.VIEW_ALL_COURSES_URL_MAPPING)
    @ResponseBody
    public List<GetAllCoursesAdminDto> viewCourses(){
       List<GetAllCoursesAdminDto> s=coursesService.getAllCourses();
        return s;
    	
    }

    @GetMapping(Constants.VIEW_COURSES_BY_ID_URL_MAPPING)
    @ResponseBody
    public ViewCourseDto viewCourse(@PathVariable(Constants.COURSE_ID) long courseId){

       ViewCourseDto s= coursesService.getCourseById(courseId);
      return s;

    }
    

    @PutMapping(Constants.EDIT_COURSE_URL_MAPPING)
    @ResponseBody
    public String editCourse(@RequestBody CourseSaveDto dto, @PathVariable(Constants.COURSE_ID) long id ){
        coursesService.editCourse(id,dto);
        return Constants.COURSE_EDITED;
    }
    

    @DeleteMapping(Constants.DELETE_COURSE_URL_MAPPING)
    @ResponseBody
   public  String deleteCourse(@PathVariable(Constants.COURSE_ID) long id){
    	
    	if(coursesService.getCourseById(id)==null)
    		throw new ResourceNotFound(Constants.COURSE_NOT_FOUND_TO_DELETE);
    	 coursesService.deleteCourse(id);
    	      return Constants.COURSE_DELETED;
        
    }

}
