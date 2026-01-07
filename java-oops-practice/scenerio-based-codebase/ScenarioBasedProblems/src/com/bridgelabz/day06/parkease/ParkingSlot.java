package com.bridgelabz.day06.parkease;

public class ParkingSlot {
    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    private String bookingLog; // internal record

    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean assignSlot(Vehicle vehicle) {
        if (!isOccupied && vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {
            isOccupied = true;
            bookingLog = "Slot " + slotId + " booked for " + vehicle.getClass().getSimpleName();
            return true;
        }
        return false;
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog += " | Slot released";
    }

    public String getSlotStatus() {
        return isOccupied ? "Occupied" : "Available";
    }

    public String getBookingLog() {
        return bookingLog;
    }
}
