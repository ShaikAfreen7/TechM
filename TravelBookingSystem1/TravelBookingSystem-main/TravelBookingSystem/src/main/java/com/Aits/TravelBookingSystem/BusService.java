package com.Aits.TravelBookingSystem;

import org.springframework.stereotype.Component;

@Component("busService")
public class BusService implements TransportService {
	
    public void bookTicket(String source, String destination, String passengerName, int age, String gender) {
        System.out.println("🚌 Bus ticket booked for " + passengerName + " (Age: " + age + ", Gender: " + gender + ") from " + source + " to " + destination);
    }
}
