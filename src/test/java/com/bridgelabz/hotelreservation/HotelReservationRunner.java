package com.bridgelabz.hotelreservation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.HashMap;

public class HotelReservationRunner {
 //@Before
 @Test
 public void setUp() throws Exception{
  HotelReservationService hotelReservationService = new HotelReservationService();

  HashMap<CustomerType,Rate> customerTypeRateMap=new HashMap<>();
  customerTypeRateMap.put(CustomerType.REGULAR,new Rate(110,90));
  customerTypeRateMap.put(CustomerType.REWARD,new Rate(80,80));
  Hotel lakewood=new Hotel("Lakewood",3,customerTypeRateMap);

  customerTypeRateMap=new HashMap<>();
  customerTypeRateMap.put(CustomerType.REGULAR,new Rate(160,40));
  customerTypeRateMap.put(CustomerType.REWARD,new Rate(110,50));
  Hotel bridgewood=new Hotel("Bridgewood",4,customerTypeRateMap);


  customerTypeRateMap=new HashMap<>();
  customerTypeRateMap.put(CustomerType.REGULAR,new Rate(220,150));
  customerTypeRateMap.put(CustomerType.REWARD,new Rate(100,40));
  Hotel ridgewood=new Hotel("Ridgewood",5,customerTypeRateMap);
  hotelReservationService.addHotel(lakewood);
  hotelReservationService.addHotel(bridgewood);
  hotelReservationService.addHotel(ridgewood);
  Assert.assertEquals(3,hotelReservationService.count);

 }


}
