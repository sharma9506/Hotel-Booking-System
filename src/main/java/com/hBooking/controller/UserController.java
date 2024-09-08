package com.hBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.hBooking.Entity.BookingForm;
import com.hBooking.Entity.User;
import com.hBooking.Repository.UserRepository;

import jakarta.validation.Valid;

import com.hBooking.Repository.BookingFormRepository;

@Controller
public class UserController {
    
    @Autowired
    private UserRepository urepo;
    
    @Autowired
    private BookingFormRepository brepo;  // Repository for BookingForm

    @RequestMapping("/")
    public String index() {
        return "index"; 
    }
    
    @RequestMapping("/userlogin")
    public String userLogin(Model model) {
        model.addAttribute("user", new User());
        return "userlogin";
    }
    
    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("user", new User());
        return "Registration";
    }
    
    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        urepo.save(user);
        return "userlogin";
    }
    
    @RequestMapping("/hotelbooking")
    public String hotelBookingForm(Model model) {
        model.addAttribute("bookform", new BookingForm());
        return "HotelBookingForm";
    }
    
    @PostMapping("/save")
    public String saveBooking(@Valid @ModelAttribute("bookform") BookingForm bookform, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "HotelBookingForm";  // Return the form if there are validation errors
        }
        brepo.save(bookform);  // Assuming brepo is BookingFormRepository
        model.addAttribute("bookform", bookform);  // Add the booking form to the model for confirmation page
        return "UserBookingDetail";
    }

}
