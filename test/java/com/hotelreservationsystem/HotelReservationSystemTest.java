package com.hotelreservationsystem;

import com.hotereservationsystem.Hotel;
import com.hotereservationsystem.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationSystemTest {

    HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
    @Test
    //checking if given hotel object are matched return true
    public void givenHotelHotelObject_ShouldReturnTrue()
    {
        boolean check = hotelReservationSystem.addHotel("lakewood",100);
        Assertions.assertTrue(check);
    }
}
