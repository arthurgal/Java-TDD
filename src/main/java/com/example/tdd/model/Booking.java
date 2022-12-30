package com.example.tdd.model;

import java.time.LocalDate;

public class Booking {

    private String id;
    private String reserve;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberGuest;

    public Booking(String id, String reserve, LocalDate checkIn, LocalDate checkOut, int numberGuest) {
        this.id = id;
        this.reserve = reserve;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numberGuest = numberGuest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int getNumberGuest() {
        return numberGuest;
    }

    public void setNumberGuest(int numberGuest) {
        this.numberGuest = numberGuest;
    }
}
