package com.MajorProject.AirBnB.App.service;

import com.MajorProject.AirBnB.App.dto.HotelDto;
import com.MajorProject.AirBnB.App.dto.HotelSearchRequest;
import com.MajorProject.AirBnB.App.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);

}
