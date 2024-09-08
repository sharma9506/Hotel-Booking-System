package com.hBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hBooking.Entity.EmployeeDetails;
import com.hBooking.Repository.EmployeeReposistory;

@Service
@Transactional
public class EmployeeService 
{
	@Autowired
    private EmployeeReposistory repo;
     
    public List<EmployeeDetails> listAll() {
        return repo.findAll();
    }
     
    public void save(EmployeeDetails employeeDetails) {
        repo.save(employeeDetails);
    }
     
    public EmployeeDetails get(int id) {
        return repo.findById(id).get();
    }
     
    public void delete(int id) {
        repo.deleteById(id);
    }
	

}
