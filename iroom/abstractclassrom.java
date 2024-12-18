
package iroom;

public abstract class abstractclassrom implements IRoom {
    // Private attributes
    private String roomName;
    private double roomArea;

    // Constructor
    public abstractclassrom(String roomName, double roomArea) {
        this.roomName = roomName;
        this.roomArea = roomArea;
    }

    // Getter for roomName
    public String getRoomName() {
        return roomName;
    }

    // Setter for roomName
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    // Getter for roomArea
    public double getRoomArea() {
        return roomArea;
    }

    // Setter for roomArea
    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    // Implementing methods from IRoom interface
    public abstract double calculateArea();

    public String getRoomDetails() {
        return "Room Name: " + roomName + ", Area: " + roomArea + " square meters";
    }
}

