package com.bridgelabz.hotelreservation;
import java.time.DayOfWeek;
import java.util.Map;

public class Hotel {
    private int rating;
    private String name;
    private  Map<CustomerType,Rate> rate;


    public Hotel( String name,int rating, Map<CustomerType, Rate> rate) {
        this.rating = rating;
        this.name = name;
        this.rate = rate;
    }


}
