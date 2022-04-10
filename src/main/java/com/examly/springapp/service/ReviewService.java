package com.examly.springapp.service;

import com.examly.springapp.model.Review;
import com.examly.springapp.web.dto.AddReviewDto;
import com.examly.springapp.web.dto.GetReviewsByCourseId;
import com.examly.springapp.web.dto.GetReviewsDto;

import java.util.List;

public interface ReviewService {

    String addReview(AddReviewDto dto);
    String editReview(AddReviewDto dto,long id);
    String deleteReview(long id);
    List<GetReviewsByCourseId> getReviewsByCourseId(long courseId);
    List<GetReviewsByCourseId> getReviewsByUserId(long userId);
}
