package com.MajorProject.AirBnB.App.repository;

import com.MajorProject.AirBnB.App.entity.Inventory;
import com.MajorProject.AirBnB.App.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    void deleteByDateAfterAndRoom(LocalDate Date, Room room);
}
