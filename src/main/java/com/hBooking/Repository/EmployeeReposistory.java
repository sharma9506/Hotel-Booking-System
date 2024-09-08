package com.hBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hBooking.Entity.EmployeeDetails;

public interface EmployeeReposistory extends JpaRepository<EmployeeDetails, Integer>
{
	

}