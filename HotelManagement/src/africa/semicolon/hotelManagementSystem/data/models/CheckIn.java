package africa.semicolon.hotelManagementSystem.data.models;

import java.time.LocalDateTime;

public class CheckIn {
    private Long checkInId;
    private Reservation reservation;  // FK → Reservation
    private Customer customer;              // FK → Guest
    private Room room;                // FK → Room
    private LocalDateTime actualCheckInDatetime;
    private Staff processedBy;        // FK → Staff
    private boolean idVerified;
    private String notes;

}
