package com.hotelreservationsystem;

import com.hotereservationsystem.Hotel;
import com.hotereservationsystem.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationSystemTest {

    @Test
    //checking if given hotel object are matched return true
    public void givenHotelObjectShouldMatch_ReturnTrue()
    {
        Hotel hotel = new Hotel("lakewood",220);
        Assertions.assertEquals(hotel.showHotelDetails(););

    }
}
