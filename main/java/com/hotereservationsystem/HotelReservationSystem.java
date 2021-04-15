package com.hotereservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

    private ArrayList<Hotel> data=new ArrayList<Hotel>();

    static Scanner sc ;

        //method to add hotel details
        public void addHotelDetails(){
            System.out.println("enter hotel name");
            String hotelName= sc.next();
            System.out.println("enter rates for regular customer");
            int ratesForRegularcustomer = sc.nextInt();
            Hotel newEntry=new Hotel(hotelName, ratesForRegularcustomer);

            this.data.add(newEntry);
        }
        
    public static void main(String[] args) {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addHotelDetails();
    }
}
