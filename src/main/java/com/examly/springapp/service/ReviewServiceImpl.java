package com.examly.springapp.service;
import com.examly.springapp.constants.Constants;
import com.examly.springapp.model.Courses;
import com.examly.springapp.model.Institute;
import com.examly.springapp.model.Review;
import com.examly.springapp.model.User;
import com.examly.springapp.repository.CoursesRepository;
import com.examly.springapp.repository.InstituteRepository;
import com.examly.springapp.repository.ReviewRepository;
import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.web.dto.AddReviewDto;
import com.examly.springapp.web.dto.GetReviewsByCourseId;
import com.examly.springapp.web.dto.GetReviewsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    CoursesRepository coursesRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    InstituteRepository instituteRepository;

    @Override
    public String addReview(AddReviewDto dto) {

        Courses course = coursesRepository.findByCourseId(dto.getCourseId());
        User user = userRepository.findByUserId(dto.getUserId());
        Review review = new Review(dto.getMessage(),dto.getStarRating(),course,user);
        reviewRepository.save(review);
        return Constants.REVIEW_SAVED;
    }

    @Override
    public String editReview(AddReviewDto dto, long id) {
        reviewRepository.editReview(dto.getMessage(),dto.getStarRating(),id);

        return Constants.REVIEW_EDITED;
    }

    @Override
    public String deleteReview(long id) {
        reviewRepository.deleteReview(id);
        return Constants.REVIEW_DELETED;
    }

    @Override
    public List<GetReviewsByCourseId> getReviewsByCourseId(long courseId) {
        List<GetReviewsDto> dto= reviewRepository.getReviewsByCourseId(courseId);
        List<GetReviewsByCourseId> list = new ArrayList<>();

        for(GetReviewsDto obj : dto){
            Courses course=coursesRepository.findByCourseId(obj.getCourseId());
            Institute institute = course.getInstitute();
            User user = userRepository.findByUserId(obj.getUserId());

            GetReviewsByCourseId review = new GetReviewsByCourseId(obj.getReviewId(),obj.getMessage(),
                    obj.getStarRating(),course.getCourseId(),course.getCourseName(),course.getCourseDescription(),
                    course.getCourseDuration(),course.getCourseTiming(),course.getCourseStudentCount(),
                    course.getCourseAcademicYear(),institute.getInstituteId(),institute.getInstituteName(),
                    institute.getInstituteDescription(),institute.getInstituteCity(),institute.getInstituteState(),
                    institute.getInstituteEmail(),institute.getInstituteMobile(),institute.getNirfRank(),
                    user.getUserId(),user.getUserEmail(),user.getUserName(),user.getUserMobileNumber());
            list.add(review);
        }
        return list;
    }

    @Override
    public List<GetReviewsByCourseId> getReviewsByUserId(long userId) {

        List<GetReviewsDto> dto= reviewRepository.getReviewsByUserId(userId);
        List<GetReviewsByCourseId> list = new ArrayList<>();

        for(GetReviewsDto obj : dto){
            Courses course=coursesRepository.findByCourseId(obj.getCourseId());
            Institute institute = course.getInstitute();
            User user = userRepository.findByUserId(obj.getUserId());

            GetReviewsByCourseId review = new GetReviewsByCourseId(obj.getReviewId(),obj.getMessage(),
                    obj.getStarRating(),course.getCourseId(),course.getCourseName(),course.getCourseDescription(),
                    course.getCourseDuration(),course.getCourseTiming(),course.getCourseStudentCount(),
                    course.getCourseAcademicYear(),institute.getInstituteId(),institute.getInstituteName(),
                    institute.getInstituteDescription(),institute.getInstituteCity(),institute.getInstituteState(),
                    institute.getInstituteEmail(),institute.getInstituteMobile(),institute.getNirfRank(),
                    user.getUserId(),user.getUserEmail(),user.getUserName(),user.getUserMobileNumber());
            list.add(review);
        }
        return list;

    }
}
