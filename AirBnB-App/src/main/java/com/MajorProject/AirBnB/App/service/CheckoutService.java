package com.MajorProject.AirBnB.App.service;

import com.MajorProject.AirBnB.App.entity.Booking;

public interface CheckoutService {
    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);
}
