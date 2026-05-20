package africa.semicolon.hotelManagementSystem.data.models;

import java.time.LocalDateTime;

public class CheckIn {
    private Long checkInId;
    private Reservation reservation;
    private Customer customer;
    private Room room;
    private LocalDateTime actualCheckInDatetime;
    private Staff processedBy;
    private boolean idVerified;
    private String notes;

}
