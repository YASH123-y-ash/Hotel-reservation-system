package com.hotelreservationsystem;

import com.hotereservationsystem.Hotel;
import com.hotereservationsystem.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservationSystemTest {

    HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
    @Test
    //checking if given hotel object are added return true
    public void givenHotelObjectShouldMatch_ReturnTrue()
    {
        boolean check = hotelReservationSystem.addHotel("lakewood",100);
        Assertions.assertTrue(check);
    }

    @Test
    //checking for cheapest hotel
    public void givenDate_ShouldFindCheapestHotel()
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMMMYYYY");
        String date[] = {"10sep2020","11sep2020"};
        Date[] dates = null;
        try{
            dates = new Date[]{dateFormat.parse(date[0]), dateFormat.parse(date[1])};
    }
        catch(ParseException exception)
    {
        System.out.println("date pattern is invalid");
        if (!dateFormat.format(date).equals(dates)){
            System.out.println("date is invalid");
        }
        else {
            System.out.println("date is valid");

        boolean check = hotelReservationSystem.addHotel("Ridgewood",220)&&
                hotelReservationSystem.addHotel("lakewood",100);
        if(check)
            Assertions.assertEquals("lakewood",hotelReservationSystem.cheapestHotel(dates));

        }
    }
}
