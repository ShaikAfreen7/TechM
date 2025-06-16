package com.Aits.TravelBookingSystem;

import org.springframework.stereotype.Component;

@Component("flightService")
public class FlightService implements TransportService {
    public void bookTicket(String source, String destination, String passengerName, int age, String gender) {
        System.out.println("✈️ Flight ticket booked for " + passengerName + " (Age: " + age + ", Gender: " + gender + ") from " + source + " to " + destination);
    }
}