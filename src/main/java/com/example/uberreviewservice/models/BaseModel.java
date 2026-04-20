package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AUto incremented the Id Value
    protected Long id;

    @Column(nullable=false)
    @Temporal(TemporalType.TIMESTAMP)//This annotaion tells about the format of date object.
    @CreatedDate //This Anootation tells that only handle it for object creation
    protected Date CreatedAt;

    @Column(nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate  //This annotation tells that only handle it for object updation
    protected Date UpdatedAt;
}
