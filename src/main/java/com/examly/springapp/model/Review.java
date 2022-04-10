package com.examly.springapp.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reviewId;
    @Column(name = "message")
    private String message;
    @Column(name="starRating")
    private long starRating;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "courseId",referencedColumnName = "courseId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Courses course;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "userId",referencedColumnName = "userId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    public Review() {
    }

    public Review(String message, long starRating, Courses course, User user) {
        this.message = message;
        this.starRating = starRating;
        this.course = course;
        this.user = user;
    }

    public Review(long reviewId, String message, long starRating, Courses course, User user) {
        this.reviewId = reviewId;
        this.message = message;
        this.starRating = starRating;
        this.course = course;
        this.user = user;
    }

    public long getReviewId() {
        return reviewId;
    }

    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
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

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
