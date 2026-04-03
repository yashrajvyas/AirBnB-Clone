package com.MajorProject.AirBnB.App.controller;

import com.MajorProject.AirBnB.App.dto.BookingDto;
import com.MajorProject.AirBnB.App.dto.BookingRequest;
import com.MajorProject.AirBnB.App.dto.GuestDto;
import com.MajorProject.AirBnB.App.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class HotelBookingController {

    private final BookingService bookingService;

    @PostMapping("/init")
    public ResponseEntity<BookingDto> initialiseBooking(@RequestBody BookingRequest bookingRequest){
        return ResponseEntity.ok(bookingService.initialiseBooking(bookingRequest));
    }

    @PostMapping("/{bookingId}/addGuests")
    public ResponseEntity<BookingDto> addGuests(@RequestBody List<GuestDto> guestDtoList,
                                                @PathVariable Long bookingId){
        return ResponseEntity.ok(bookingService.addGuests(bookingId, guestDtoList));
    }
}
