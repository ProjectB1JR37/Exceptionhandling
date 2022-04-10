package com.examly.springapp.web.dto;

import com.examly.springapp.model.Courses;
import com.examly.springapp.model.User;

public interface GetReviewsDto {

    long getReviewId();
    String getMessage();
    String getStarRating();
    long getCourseId();
    long  getUserId();
}
