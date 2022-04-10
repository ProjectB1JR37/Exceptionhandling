package com.examly.springapp.repository;

import com.examly.springapp.model.Review;
import com.examly.springapp.web.dto.GetReviewsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.examly.springapp.constants.Constants;

public interface ReviewRepository extends JpaRepository<Review,Long> {

    @Modifying
    @Transactional
    @Query(value = Constants.EDIT_REVIEW_QUERY,nativeQuery = true)
    void editReview(String mess , long rating, long id);

    @Modifying
    @Transactional
    @Query(value = Constants.DELETE_REVIEW_QUERY,nativeQuery = true)
    void deleteReview(long id);

    @Query(value = Constants.GET_REVIEW_BY_COURSE_ID_QUERY,nativeQuery = true)
    List<GetReviewsDto> getReviewsByCourseId(long courseId);

    @Query(value = Constants.GET_REVIEW_BY_USER_ID_QUERY,nativeQuery = true)
    List<GetReviewsDto> getReviewsByUserId(long userId);
}
