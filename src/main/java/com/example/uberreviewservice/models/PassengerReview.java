package com.example.uberreviewservice.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

@PrimaryKeyJoinColumn(name="Passenger_Review_Id")

public class PassengerReview extends Review{

    @Column(nullable=false)
    private String PassengerComments;

    @Column(nullable = false)
    private String PassengerRating;
}
