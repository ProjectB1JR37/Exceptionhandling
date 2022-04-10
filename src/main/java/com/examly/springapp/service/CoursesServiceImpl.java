package com.examly.springapp.service;

import com.examly.springapp.model.Courses;
import com.examly.springapp.service.CoursesService;

import exception.ResourceNotFound;
import com.examly.springapp.constants.Constants;
import com.examly.springapp.model.Institute;
import com.examly.springapp.repository.CoursesRepository;
import com.examly.springapp.repository.InstituteRepository;
import com.examly.springapp.web.dto.CourseSaveDto;
import com.examly.springapp.web.dto.GetAllCoursesAdminDto;
import com.examly.springapp.web.dto.GetAllCoursesDto;
import com.examly.springapp.web.dto.ViewCourseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService{
    @Autowired
    CoursesRepository coursesRepository;
    @Autowired
    InstituteRepository instituteRepository;
    @Override
    public Courses saveCourse(CourseSaveDto dto) {
        Institute institute = instituteRepository.findByInstituteId(dto.getInstituteId());
        Courses course = new Courses(dto.getCourseName(),dto.getCourseDescription(),
                dto.getCourseDuration(),dto.getCourseTiming(),dto.getCourseStudentCount(),
                dto.getCourseAcademicYear(),dto.getCourseRequiredPercentage(),institute);
        
        	if(dto.getCourseName().isEmpty()||dto.getCourseDescription().isEmpty()||dto.getCourseDuration().isEmpty()||
        		dto.getCourseTiming().isEmpty()||dto.getCourseStudentCount().isEmpty()||
                    dto.getCourseAcademicYear().isEmpty()||dto.getCourseRequiredPercentage().isEmpty()) {
        		throw new ResourceNotFound(Constants.COURSE_FIELDS_EMPTY);
        	}
        	return coursesRepository.save(course);
        	
        
    }

    @Override
    public List<GetAllCoursesDto> getAllCourses(Long instituteId) {

        List<GetAllCoursesDto> courseList=coursesRepository.getAllCourses(instituteId);
       /* for(Courses i : courseList){
            System.out.println(i.getCourseName());
        }*/
        return courseList;
    }

    @Override
    public List<GetAllCoursesAdminDto> getAllCourses() {
          List<GetAllCoursesDto> listCourse=coursesRepository.getAllCourses();
        ArrayList<GetAllCoursesAdminDto> adminCourseList= new ArrayList<>();
          for(GetAllCoursesDto dto:listCourse){
              Institute institute = instituteRepository.findByInstituteId(dto.getInstituteId());
              GetAllCoursesAdminDto getAllCoursesAdminDto = new GetAllCoursesAdminDto(
                      institute.getInstituteName(),dto.getCourseId(),dto.getCourseName(),
                      dto.getCourseDescription(),dto.getCourseDuration(),dto.getCourseTiming(),
                       dto.getCourseStudentCount(), dto.getCourseAcademicYear(),
                      dto.getCourseRequiredPercentage());
              adminCourseList.add(getAllCoursesAdminDto);

          }
    return adminCourseList;
    }

    @Override
    public ViewCourseDto getCourseById(long id) {
   /*
    		if(coursesRepository.findByCourseId(id)==null) {
    			throw new ResourceNotFound("Course not found");
    		}
    		return coursesRepository.findByCourseId(id);
    	} this is breaking the code...try exception handling at below code please*/
        Courses course = coursesRepository.findByCourseId(id);
        if(course==null) {
        	throw new ResourceNotFound(Constants.COURSE_NOT_FOUND);
        }
       
        ViewCourseDto courseDto = new ViewCourseDto(
                course.getCourseId(), course.getCourseName(), course.getCourseDescription(),
                course.getCourseDuration(), course.getCourseTiming(), course.getCourseStudentCount(),
                course.getCourseAcademicYear(), course.getCourseRequiredPercentage()
        );

        return courseDto;

    }

    @Override
    public void editCourse(long id, CourseSaveDto dto) {

        coursesRepository.editCourseById(id,dto.getCourseName(),dto.getCourseDescription(),
                dto.getCourseDuration(),dto.getCourseTiming(),dto.getCourseStudentCount(),
                dto.getCourseAcademicYear(),dto.getCourseRequiredPercentage());
        
        if(dto.getCourseName().isEmpty()||dto.getCourseDescription().isEmpty()||dto.getCourseDuration().isEmpty()||
        		dto.getCourseTiming().isEmpty()||dto.getCourseStudentCount().isEmpty()||
                    dto.getCourseAcademicYear().isEmpty()||dto.getCourseRequiredPercentage().isEmpty()) {
        		throw new ResourceNotFound(Constants.COURSE_FIELDS_EMPTY);
        	}
        
        Courses course = coursesRepository.findByCourseId(id);
        if(course==null) {
        	throw new ResourceNotFound(Constants.COURSE_NOT_FOUND);
        }
    }

    @Override
    public void deleteCourse(long id) {
    	Courses course = coursesRepository.findByCourseId(id);
        if(course==null) {
        	throw new ResourceNotFound(Constants.COURSE_NOT_FOUND_TO_DELETE);
        }
    		coursesRepository.deleteCourseById(id);
    	
    	
         //coursesRepository.deleteCourseById(id);
    }


}