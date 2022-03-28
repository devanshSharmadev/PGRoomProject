package com.pgroomapp.service;

import com.pgroomapp.model.RoomMember;
import com.pgroomapp.repository.IRoomMateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomMateServiceImpl implements IRoomMateService{

    @Autowired
    private IRoomMateRepository roomMateRepository;

    public void setRoomMateRepository(IRoomMateRepository roomMateRepository) {
        this.roomMateRepository = roomMateRepository;
    }

    @Override
    public void addRoomMate(RoomMember roomMember) {
        roomMateRepository.insert(roomMember);
    }
}
