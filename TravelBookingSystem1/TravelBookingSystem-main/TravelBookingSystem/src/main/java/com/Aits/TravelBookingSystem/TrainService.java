package com.Aits.TravelBookingSystem;

import org.springframework.stereotype.Component;

@Component("trainService")
public class TrainService implements TransportService {
    public void bookTicket(String source, String destination, String passengerName, int age, String gender) {
        System.out.println("🚆 Train ticket booked for " + passengerName + " (Age: " + age + ", Gender: " + gender + ") from " + source + " to " + destination);
    }
}