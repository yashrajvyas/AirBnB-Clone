package com.MajorProject.AirBnB.App.repository;

import com.MajorProject.AirBnB.App.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}