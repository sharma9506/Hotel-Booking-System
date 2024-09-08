package com.hBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hBooking.Entity.BookingForm;
import com.hBooking.Repository.GuestBookingRepository;

@Service
public class UserService 
{
	@Autowired
	private GuestBookingRepository guestepo;
    public List<BookingForm> guestdetailAll() {
        return guestepo.findAll();
    }
     

}