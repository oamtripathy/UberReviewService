package com.example.uberreviewservice.adapters;

import com.example.uberreviewservice.dtos.CreateReviewDto;
import com.example.uberreviewservice.models.Booking;
import com.example.uberreviewservice.models.Review;
import com.example.uberreviewservice.repository.BookingRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class createReviewDtoToReviewAdapterImpl implements createReviewDtoToReviewAdapter {

    private final BookingRepository bookingRepository;

    public createReviewDtoToReviewAdapterImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Review ConvertDto(CreateReviewDto createReviewDto) {
        if (createReviewDto.getBookingId() == null) {
            return null;
        }

        Optional<Booking> booking=bookingRepository.findById(createReviewDto.getBookingId());

        if(booking.isEmpty()){
            return null;
        }
        Review review=Review.builder()
                .Rating(createReviewDto.getRating())
                .booking(booking.get())
                .Content(createReviewDto.getContent())
                .build();
        return  review;

    }
}
