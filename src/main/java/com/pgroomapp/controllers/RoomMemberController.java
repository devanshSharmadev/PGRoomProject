package com.pgroomapp.controllers;

import com.pgroomapp.model.RoomMember;
import com.pgroomapp.service.IRoomMateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("roommember-api")
public class RoomMemberController {

    @Autowired
    private IRoomMateService roomMateService;

    @PostMapping("/roommember")
    void addRoomMember(RoomMember roomMember){
        roomMateService.addRoomMate(roomMember);
    }

}
