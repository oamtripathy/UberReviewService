package com.example.uberreviewservice.repository;


import com.example.uberreviewservice.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Date;
import java.util.List;


public interface ReviewRepository extends JpaRepository<Review, Long> {

    Integer countAllByRatingIsLessThanEqual(Integer rating);

    List<Review> findAllByRatingIsLessThanEqual(Integer rating);

    List<Review> findAllByCreatedAtBefore(Date date);

    @Query("select r from Booking b inner join Review r where b.id= :bookingId")
    Review findReviewsByBookingId(Long bookingId);


}
