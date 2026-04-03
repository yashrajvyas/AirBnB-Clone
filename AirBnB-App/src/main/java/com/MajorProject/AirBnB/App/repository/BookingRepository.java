package com.MajorProject.AirBnB.App.repository;

import com.MajorProject.AirBnB.App.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
