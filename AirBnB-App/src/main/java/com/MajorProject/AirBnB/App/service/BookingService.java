package com.MajorProject.AirBnB.App.service;

import com.MajorProject.AirBnB.App.dto.BookingDto;
import com.MajorProject.AirBnB.App.dto.BookingRequest;
import com.MajorProject.AirBnB.App.dto.GuestDto;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);

}
