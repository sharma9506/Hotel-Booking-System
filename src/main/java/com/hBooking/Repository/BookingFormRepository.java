package com.hBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hBooking.Entity.BookingForm;

public interface BookingFormRepository extends JpaRepository<BookingForm, Integer> {
}
