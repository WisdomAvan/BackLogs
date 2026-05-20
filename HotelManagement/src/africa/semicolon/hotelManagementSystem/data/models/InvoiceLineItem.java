package africa.semicolon.hotelManagementSystem.data.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InvoiceLineItem {
    private Long lineItemId;
    private Invoice invoice;          // FK → Invoice
    private String description;       // "Room Charge", "Room Service", "Minibar", etc.
    private LineItemType itemType;    // ROOM_CHARGE, SERVICE, FOOD, EXTRA, TAX, DISCOUNT
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;    // quantity * unitPrice
    private LocalDate serviceDate;

    public Long getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(Long lineItemId) {
        this.lineItemId = lineItemId;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LineItemType getItemType() {
        return itemType;
    }

    public void setItemType(LineItemType itemType) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }
}
