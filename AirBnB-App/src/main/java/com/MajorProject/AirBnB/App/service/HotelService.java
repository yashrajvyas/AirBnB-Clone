package com.MajorProject.AirBnB.App.service;

import com.MajorProject.AirBnB.App.dto.HotelDto;

public interface HotelService {
     HotelDto createNewHotel(HotelDto hotelDto);

     HotelDto getHotelById(Long id);

     HotelDto updateHotelById(Long id, HotelDto hotelDto);

     void deleteHotelById(Long id);

     void activateHotel(Long hotelId);
}
