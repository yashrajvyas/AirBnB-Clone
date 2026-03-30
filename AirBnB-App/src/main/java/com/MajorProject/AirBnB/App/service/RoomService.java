package com.MajorProject.AirBnB.App.service;

import com.MajorProject.AirBnB.App.dto.HotelDto;
import com.MajorProject.AirBnB.App.dto.RoomDto;

import java.util.List;

public interface RoomService {

    RoomDto createNewRoom(Long hotelId, RoomDto roomDto);

    List<RoomDto> getAllRoomsInHotel(Long hotelId);

    RoomDto getRoomById(Long roomId);

    void deleteRoomById(Long roomId);
}
