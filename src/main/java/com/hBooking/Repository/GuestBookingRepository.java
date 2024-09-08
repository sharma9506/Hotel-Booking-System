package com.hBooking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hBooking.Entity.BookingForm;

public interface GuestBookingRepository extends JpaRepository<BookingForm, Integer>
{

	

}