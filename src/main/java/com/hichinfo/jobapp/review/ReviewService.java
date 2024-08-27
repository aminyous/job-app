package com.hichinfo.jobapp.review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    boolean createReview(Long companyId, Review review);

    Review getReview(Long companyId, Long reviewId);

    boolean updateReview(Long companyId, Long reviewId, Review review);

    boolean deleteById(Long companyId, Long reviewId);
}
