package com.example.uberreviewservice.models;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_review")

@Inheritance(strategy=InheritanceType.JOINED)
public class Review extends BaseModel {

    @Column(nullable=false)
    private String Content;

    private Double Rating;

    @OneToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Booking booking;

    @Override
    public String toString() {
        return "Review : "+this.Content+" "+this.Rating+" "+"booking :"+this.booking.getId()+" "+this.CreatedAt;
    }

}
