package com.MajorProject.AirBnB.App.service;

import com.MajorProject.AirBnB.App.dto.BookingDto;
import com.MajorProject.AirBnB.App.dto.BookingRequest;
import com.MajorProject.AirBnB.App.dto.GuestDto;
import com.stripe.model.Event;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);
}
