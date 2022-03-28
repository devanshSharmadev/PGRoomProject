package com.pgroomapp.service;

import com.pgroomapp.exceptions.IdNotFoundException;
import com.pgroomapp.exceptions.RoomNotFoundException;
import com.pgroomapp.model.Room;
import com.pgroomapp.repository.IRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService{

    @Autowired
    IRoomRepository roomRepository;

    @Override
    public void addRoom(Room room) {
        roomRepository.insert(room);
    }

    @Override
    public void updateRoom(Room room) {
        roomRepository.save(room);
    }

    @Override
    public void deleteRoom(int roomId) {
        roomRepository.deleteById(roomId);
    }

    @Override
    public Room getById(int roomId) throws IdNotFoundException {
        return roomRepository.findById(roomId).orElseThrow(()->new IdNotFoundException("No room with this ID"));
    }

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public List<Room> getByRoomSharingType(Integer sharingType) throws RoomNotFoundException {
        List<Room> rooms=roomRepository.findByRoomSharingType(sharingType);
        if(rooms.isEmpty())
            throw new RoomNotFoundException("No such room with that room sharing type");
        return rooms;

    }

    @Override
    public List<Room> getByRentPerPerson(double rentPerPerson) throws RoomNotFoundException {
        List<Room> rooms=roomRepository.findByRentPerPerson(rentPerPerson);
        if(rooms.isEmpty())
            throw new RoomNotFoundException("NO such room exists with lower room rent");

        return rooms;
    }

    @Override
    public List<Room> getByWifi(Boolean wifi) throws RoomNotFoundException {
        List<Room> rooms=roomRepository.findByWifi(wifi);
        if(rooms.isEmpty())
            throw new RoomNotFoundException("No such room with wifi");
        return rooms;
    }

    @Override
    public List<Room> getByBalcony(Boolean balcony) throws RoomNotFoundException {
        List<Room> rooms=roomRepository.findByBalcony(balcony);
        if(rooms.isEmpty())
            throw new RoomNotFoundException("No such room with balcony");
        return rooms;
    }

    @Override
    public List<Room> getByWallColor(String wallColor) throws RoomNotFoundException {
        List<Room> room=roomRepository.findByWallColor(wallColor);
        if(room.isEmpty())
            throw new RoomNotFoundException("No such room with this color");
        return room;
    }

    @Override
    public List<Room> getByRoomCleaningService(Boolean roomCleaningService) throws RoomNotFoundException {
        List<Room> rooms=roomRepository.findByRoomCleaningService(roomCleaningService);
        if(rooms.isEmpty())
            throw new RoomNotFoundException("No such room with this cleaning service");
        return rooms;
    }

    @Override
    public List<Room> getByBalconyAndWifi(Boolean balcony, Boolean wifi) throws RoomNotFoundException {
        List<Room> rooms=roomRepository.findByBalconyAndWifi(balcony,wifi);
        if(rooms.isEmpty())
            throw new RoomNotFoundException("No such room with wifi and balcony exists");
        return rooms;
    }
}
