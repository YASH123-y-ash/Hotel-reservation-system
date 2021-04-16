package com.hotereservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

    private ArrayList<Hotel> data=new ArrayList<Hotel>();

    //method to add hotel details
    public boolean addHotel(){
        Hotel hotel = new Hotel();
        boolean added = data.add(hotel);
        return added;
    }
    public boolean addHotel(String hotelName,int ratesForRegularCustomer)
    {
        Hotel hotel = new Hotel();
        boolean added = data.add(hotel);
        return added;
    }

    public static void main(String[] args) {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addHotel();
    }
}
