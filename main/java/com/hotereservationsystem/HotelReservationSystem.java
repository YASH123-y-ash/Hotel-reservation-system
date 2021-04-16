package com.hotereservationsystem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
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

        //method to find cheapest hotel
        public String cheapestHotel(Date[] dates)
        {
            ArrayList<Integer> cheapHotel = new ArrayList<>();
            for (Hotel hotel : data)
            {
                int rate = 0;
                for (Date date : dates)
                {
                    rate = hotel.getratesForRegularCustomer();
                }
                cheapHotel.add(rate);
            }
            Integer cheapRate = cheapHotel.stream().min(Comparator.comparing(Integer :: intValue)).orElse(null);
            int position = cheapHotel.indexOf(cheapRate);
            return data.get(position).getHotelName();
        }

    public static void main(String[] args) {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addHotel();
    }
}
