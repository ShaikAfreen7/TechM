package com.Aits.TravelBookingSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public interface BookingService {
    void book(String mode, String source, String destination, String passengerName, int age, String gender);
    
    @Service
    class BookingServiceImpl implements BookingService {
        private final Map<String, TransportService> transportServices;

        @Autowired
        public BookingServiceImpl(Map<String, TransportService> transportServices) {
            this.transportServices = transportServices;
        }

        @Override
        public void book(String mode, String source, String destination, String passengerName, int age, String gender) {
            TransportService transportService = transportServices.get(mode);
            if (transportService != null) {
                transportService.bookTicket(source, destination, passengerName, age, gender);
            } else {
                System.out.println("❌ Invalid transport mode selected!");
            }
        }
    }
}