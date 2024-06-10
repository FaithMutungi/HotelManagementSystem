package com.Precious.PreciousHotel.service.interfac;

import com.Precious.PreciousHotel.dto.Response;
import com.Precious.PreciousHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}