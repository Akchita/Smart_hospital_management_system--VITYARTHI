package model;

public class EmergencyRoom extends HospitalResource {

    private int roomNumber;

    public EmergencyRoom(int resourceId, int roomNumber) {
        super(resourceId, "EMERGENCY_ROOM");
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Emergency Room ID: " + getResourceId() +
                ", Room Number: " + roomNumber +
                ", Available: " + isAvailable();
    }
}