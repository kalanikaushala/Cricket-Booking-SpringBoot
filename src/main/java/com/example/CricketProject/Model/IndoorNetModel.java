package com.example.CricketProject.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="tbl_indoornet")
public class IndoorNetModel {
    @Id
    @GeneratedValue

    private int bookingId;
    private String cusName;
    private String mobile;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate date;

    public IndoorNetModel() {
    }

    public IndoorNetModel(String cusName, String mobile, LocalTime startTime, LocalTime endTime, LocalDate date, int bookingId) {
        this.cusName = cusName;
        this.mobile = mobile;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.bookingId = bookingId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
