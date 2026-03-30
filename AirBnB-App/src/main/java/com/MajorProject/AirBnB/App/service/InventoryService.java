package com.MajorProject.AirBnB.App.service;

import com.MajorProject.AirBnB.App.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);
}
