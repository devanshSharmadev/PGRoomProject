package com.pgroomapp.service;

import com.pgroomapp.exceptions.IdNotFoundException;
import com.pgroomapp.exceptions.RoomNotFoundException;
import com.pgroomapp.model.Room;

import java.util.List;

public interface IRoomService {
    void addRoom(Room room);
    void updateRoom(Room room);
    void deleteRoom(int roomId);
    Room getById(int roomId) throws IdNotFoundException;
    List<Room> getAll();

    List<Room> getByRoomSharingType(Integer sharingType) throws RoomNotFoundException;
    List<Room> getByRentPerPerson(double rentPerPerson) throws RoomNotFoundException;
    List<Room> getByWifi(Boolean wifi) throws RoomNotFoundException;
    List<Room> getByBalcony(Boolean balcony) throws RoomNotFoundException;
    List<Room> getByWallColor(String wallColor) throws RoomNotFoundException;
    List<Room> getByRoomCleaningService(Boolean roomCleaningService) throws RoomNotFoundException;
    List<Room> getByBalconyAndWifi(Boolean balcony, Boolean wifi) throws RoomNotFoundException;

}
