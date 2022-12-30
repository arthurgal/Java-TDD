package com.example.tdd.service;

import com.example.tdd.model.Booking;
import com.example.tdd.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public int DaysCalculatorWithDatabase(String name) {
        Optional<Booking> days = bookingRepository.findByReserve(name);
        return Period.between(days.get().getCheckIn(), days.get().getCheckOut()).getDays();
    }

    public boolean NumberGuestCaculator(String name) {

        Optional<Booking> number = bookingRepository.findByReserve(name);

        if (number.get().getNumberGuest() > 0){
            return true;
        }else{
            return false;
        }
    }
}
