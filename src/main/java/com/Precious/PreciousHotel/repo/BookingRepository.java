package com.Precious.PreciousHotel.repo;

import com.Precious.PreciousHotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByRoomId(Long roomId);


    List<Booking> findByUserId(Long userId);

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}