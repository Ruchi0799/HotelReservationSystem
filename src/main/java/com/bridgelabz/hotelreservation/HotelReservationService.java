package com.bridgelabz.hotelreservation;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationService {
    private List<Hotel> hotels;
    public int count=0;
    private static final DateTimeFormatter DATE_RANGE_FORMAT=DateTimeFormatter.ofPattern("ddMMyyyy");

    public HotelReservationService(){
        this.hotels=new ArrayList<>();
    }

    public void greetCustomer(){
        System.out.println("*******WELCOME TO HOTEL RESERVATION SYSTEM*******");
    }

    public boolean addHotel(Hotel hotel)
    {
        count();
        return this.hotels.add(hotel);
    }

    public int count(){
        count++;
        return count;
    }


}
