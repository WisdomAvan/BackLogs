package africa.semicolon.hotelManagementSystem.data.models;

import java.time.LocalDateTime;

public class CheckOut {
    private Long checkOutId;
    private Reservation reservation;
    private Customer customer;
    private Room room;
    private LocalDateTime actualCheckOutDatetime;
    private Staff processedBy;
    private boolean earlyCheckout;
    private String notes;

    public Long getCheckOutId() {
        return checkOutId;
    }

    public void setCheckOutId(Long checkOutId) {
        this.checkOutId = checkOutId;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDateTime getActualCheckOutDatetime() {
        return actualCheckOutDatetime;
    }

    public void setActualCheckOutDatetime(LocalDateTime actualCheckOutDatetime) {
        this.actualCheckOutDatetime = actualCheckOutDatetime;
    }

    public Staff getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(Staff processedBy) {
        this.processedBy = processedBy;
    }

    public boolean isEarlyCheckout() {
        return earlyCheckout;
    }

    public void setEarlyCheckout(boolean earlyCheckout) {
        this.earlyCheckout = earlyCheckout;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
