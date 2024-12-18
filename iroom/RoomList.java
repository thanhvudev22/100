package iroom;

import iroom.IRoom.Room;
import java.util.ArrayList;

public class RoomList {

    private final ArrayList<abstractclassrom> roomList;

    public RoomList() {
        this.roomList = new ArrayList<>();
    }

    public ArrayList<abstractclassrom> getRoomList() {
        return roomList;
    }

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        roomList.add(meetingRoom);
    }

    public void addBedRoom(BedRoom bedRoom) {
        roomList.add(bedRoom);
    }

    public boolean updateRoomById(String id, abstractclassrom updatedRoom) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getId().equals(id)) {
                roomList.set(i, updatedRoom);
                return true;
            }
        }
        return false;
    }

    public boolean deleteRoomById(String id) {
        return roomList.removeIf(room -> room.getId().equals(id));
    }

    public abstractclassrom findRoomById(String id) {
        for (abstractclassrom room : roomList) {
            if (room.getId().equals(id)) {
                return room;
            }
        }
        return null;
    }

    public void displayAllRooms() {
        for (abstractclassrom room : roomList) {
            room.displayDetails();
            System.out.println("---------------------------");
        }
    }

    public abstractclassrom findMostExpensiveRoom() {
        abstractclassrom mostExpensive = null;
        for (abstractclassrom room : roomList) {
            if (mostExpensive == null || room.calculateCost() > mostExpensive.calculateCost()) {
                mostExpensive = room;
            }
        }
        return mostExpensive;
    }

    public void countRooms() {
        int meetingRoomCount = 0;
        int bedRoomCount = 0;

        for (abstractclassrom room : roomList) {
            if (room instanceof MeetingRoom) {
                meetingRoomCount++;
            } else if (room instanceof BedRoom) {
                bedRoomCount++;
            }
        }

        System.out.println("Total Meeting Rooms: " + meetingRoomCount);
        System.out.println("Total Bed Rooms: " + bedRoomCount);
    }
}
