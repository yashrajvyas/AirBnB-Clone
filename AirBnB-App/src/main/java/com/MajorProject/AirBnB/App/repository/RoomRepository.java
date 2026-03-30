package com.MajorProject.AirBnB.App.repository;

import com.MajorProject.AirBnB.App.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
