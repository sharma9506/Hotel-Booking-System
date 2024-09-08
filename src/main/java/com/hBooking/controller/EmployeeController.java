package com.hBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hBooking.Entity.Admin;
import com.hBooking.Entity.BookingForm;
import com.hBooking.Entity.EmployeeDetails;
import com.hBooking.Service.EmployeeService;
import com.hBooking.Service.UserService;




@Controller
public class EmployeeController
{
	
	@Autowired
    private EmployeeService service;
	/*
	 * @GetMapping("/adminLogin") public String viewHomePage(Model model) {
	 * List<EmployeeDetails> listEmployee = service.listAll();
	 * model.addAttribute("listEmployee", listEmployee); return "adminLogin"; }
	 */
	
	@RequestMapping("/adminLogin")
	public String index1(Model model) {
		model.addAttribute("admin", new Admin());
		return "adminLogin";
	}
	
	@GetMapping("/indexAdmin")
	public String viewHomePage1(Model model) {
	    List<EmployeeDetails> listEmployee = service.listAll();
	    model.addAttribute("listEmployee", listEmployee);     
	    return "indexAdmin";
	}	
	
	
	@RequestMapping("/new")
	public String showNewEmployeePage(Model model) {
	    model.addAttribute("employeeDetails", new EmployeeDetails());
	    return "new";
	}
	  
	@PostMapping("/ssave")
		public String index2(EmployeeDetails employeeDetails) {
			service.save(employeeDetails);
			return "redirect:/indexAdmin";
		}
	
	  @GetMapping("/edit/{id}") 
	  public ModelAndView showEditProductPage(@PathVariable(name ="id") int id)
	  { 
		  ModelAndView mav =new ModelAndView("EditEmployee"); 
		  EmployeeDetails employeeDetails =service.get(id); 
		  mav.addObject("employeeDetails", employeeDetails);
		  return mav; 
	  }	  
	  
	  @GetMapping("/delete/{id}") 
	  public String deleteProduct(@PathVariable(name ="id") int id) 
	  { 
		  service.delete(id); 
		  return "redirect:/indexAdmin"; 		  
	  }
	  
		@RequestMapping("/employeelogin")
		public String index2(Model model) {
			model.addAttribute("employeeDetials", new EmployeeDetails());
			return "employeelogin";
		}
		
		@Autowired
		private UserService us;
		@RequestMapping("/guestdetails")
		public String viewHomePage2(Model model) {
			List<BookingForm> listguest = us.guestdetailAll();
		    model.addAttribute("listguest",listguest );     
		    return "guestdetails";
		}	
	 

}