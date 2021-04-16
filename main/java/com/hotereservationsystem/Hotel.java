package com.hotereservationsystem;

public class Hotel {

    //variables
    private String hotelName;
    private int ratesForRegularCustomer;

    //constructor
    public Hotel() {

        this.hotelName = hotelName;
        this.ratesForRegularCustomer = ratesForRegularCustomer;
    }

    //method to set attributes
    public void setfirstName(String hotelName){
        this.hotelName = hotelName;
    }
    public void setlastName(int ratesForRegularCustomer){
        this.ratesForRegularCustomer = ratesForRegularCustomer;
    }

    //to get attributes
    public String getHotelName(){
        return this.hotelName;
    }
    public int getratesForRegularCustomer(){
        return this.ratesForRegularCustomer;
    }

    // to show hotel details
    public void showHotelDetails()
    {
        System.out.println("First name :: "+ this.getHotelName());
        System.out.println("Last  name :: "+ this.getratesForRegularCustomer());
    }

}
