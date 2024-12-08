/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.Platform;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class RoomDirectory {
    private ArrayList<Room> roomList;
    
    public RoomDirectory() {
        this.roomList = new ArrayList<Room>(5);
        roomList.add(new Room("A"));
        roomList.add(new Room("B"));
        roomList.add(new Room("C"));
        roomList.add(new Room("D"));
        roomList.add(new Room("E"));
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
}
