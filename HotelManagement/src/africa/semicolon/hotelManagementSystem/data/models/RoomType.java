package africa.semicolon.hotelManagementSystem.data.models;

import java.math.BigDecimal;

public class RoomType {
    private Long roomTypeId;
    private String roomType;             // SINGLE, DOUBLE, SUITE, DELUXE
    private String description;
    private int maxiOccupancy;
    private BigDecimal basePricePerNight;
    private String amenities;
    private String bedType;

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxiOccupancy() {
        return maxiOccupancy;
    }

    public void setMaxiOccupancy(int maxiOccupancy) {
        this.maxiOccupancy = maxiOccupancy;
    }

    public BigDecimal getBasePricePerNight() {
        return basePricePerNight;
    }

    public void setBasePricePerNight(BigDecimal basePricePerNight) {
        this.basePricePerNight = basePricePerNight;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }
}
