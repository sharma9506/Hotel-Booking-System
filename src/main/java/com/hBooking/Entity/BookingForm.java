
package com.hBooking.Entity;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookingDetails")
public class BookingForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String roomtype;
    private String sm;
    private long contact;
    private Long alternatenumber;
    private String numberofguest;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;  // Use LocalDate instead of java.sql.Date

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRoomtype() {
        return roomtype;
    }
    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }
    public String getSm() {
        return sm;
    }
    public void setSm(String sm) {
        this.sm = sm;
    }
    public long getContact() {
        return contact;
    }
    public void setContact(long contact) {
        this.contact = contact;
    }
    public Long getAlternatenumber() {
        return alternatenumber;
    }
    public void setAlternatenumber(Long alternatenumber) {
        this.alternatenumber = alternatenumber;
    }
    public String getNumberofguest() {
        return numberofguest;
    }
    public void setNumberofguest(String numberofguest) {
        this.numberofguest = numberofguest;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
