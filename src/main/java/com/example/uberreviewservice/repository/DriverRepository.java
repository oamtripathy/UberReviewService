package com.example.uberreviewservice.repository;

import com.example.uberreviewservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver,Long> {

    Optional<Driver> findByIdAndLicenceNumber(Long id,String licenceNumber);

    @Override
    Optional<Driver> findById(Long aLong);


    @Query(nativeQuery = true,value = "select * from driver where id=:id and licence_number=:licence")
    Optional<Driver> rawFindByIdAndLicenceNumber(Long id,String licence);

    List<Driver> findAllByIdIn(List<Long> driverIds);
}
