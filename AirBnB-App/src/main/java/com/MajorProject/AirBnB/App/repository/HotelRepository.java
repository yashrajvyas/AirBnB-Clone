package com.MajorProject.AirBnB.App.repository;

import com.MajorProject.AirBnB.App.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
