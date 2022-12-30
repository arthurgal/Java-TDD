package com.example.tdd;

import com.example.tdd.model.Booking;
import com.example.tdd.repository.BookingRepository;
import com.example.tdd.service.BookingService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
public class BookingServiceTest {


    @TestConfiguration
    static class BookingServiceTestConfiguration{

        @Bean
        public BookingService bookingService(){
            return new BookingService();
        }

    }

    @Autowired
    BookingService bookingService;

    @MockBean
    BookingRepository bookingRepository;

    @Test
    public void bookingTestServiceDaysCalculator(){
        String name = "Jhon";
        int days = bookingService.DaysCalculatorWithDatabase(name);


        Assertions.assertEquals(days, 10);
    }

    @Test
    public  void bookingTestServiceNumberGuest(){
        String name = "Jhon";
        boolean number = bookingService.NumberGuestCaculator(name);

        Assertions.assertTrue(number);
    }

    @Before
    public void setup(){
        LocalDate checkIn = LocalDate.parse("2022-02-10");
        LocalDate checkOut = LocalDate.parse("2022-02-20");
        Booking booking = new Booking("1", "Jhon", checkIn, checkOut, 5);

        Mockito.when(bookingRepository.findByReserve(booking.getReserve()))
                .thenReturn(java.util.Optional.of(booking));

    }
}
