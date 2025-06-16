package com.Aits.TravelBookingSystem;

import com.Aits.TravelBookingSystem.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan("com.Aits.TravelBookingSystem")
public class TravelBookingSystemApplication {
    private final BookingService bookingService;

    @Autowired
    public TravelBookingSystemApplication(BookingService bookingService) {
        this.bookingService = bookingService;
        startBooking();
    }

    public static void main(String[] args) {
        SpringApplication.run(TravelBookingSystemApplication.class, args);
    }

    public void startBooking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("👤 Enter passenger name: ");
        String passengerName = scanner.nextLine();
        System.out.println("🎂 Enter passenger age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("🚻 Enter passenger gender (Male/Female/Other): ");
        String gender = scanner.nextLine();
        System.out.println("📍 Enter source: ");
        String source = scanner.nextLine();
        System.out.println("🌟 Enter destination: ");
        String destination = scanner.nextLine();
        System.out.println("🚤 Choose mode of transport (busService/trainService/flightService): ");
        String mode = scanner.nextLine();

        bookingService.book(mode, source, destination, passengerName, age, gender);
    }
}
