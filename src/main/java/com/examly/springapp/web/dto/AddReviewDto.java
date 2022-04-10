package com.examly.springapp.web.dto;

public class AddReviewDto {
    private long userId;
    private long courseId;
    private String message;
    private long starRating;

    public AddReviewDto() {
    }

    public AddReviewDto(long userId, long courseId, String message, long starRating) {
        this.userId = userId;
        this.courseId = courseId;
        this.message = message;
        this.starRating = starRating;
    }

    public AddReviewDto(String message, long starRating) {
        this.message = message;
        this.starRating = starRating;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getStarRating() {
        return starRating;
    }

    public void setStarRating(long starRating) {
        this.starRating = starRating;
    }
}
