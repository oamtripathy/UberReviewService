package com.example.uberreviewservice.adapters;

import com.example.uberreviewservice.dtos.CreateReviewDto;
import com.example.uberreviewservice.models.Review;

public interface createReviewDtoToReviewAdapter {

    public Review ConvertDto(CreateReviewDto dto);

}
