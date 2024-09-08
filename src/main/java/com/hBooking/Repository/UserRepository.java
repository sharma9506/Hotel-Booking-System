package com.hBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hBooking.Entity.BookingForm;
import com.hBooking.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer>
{
	@Query("Select u from User u where u.email=?1")
	public User findByEmail(String email);

	public void save(BookingForm book);


}