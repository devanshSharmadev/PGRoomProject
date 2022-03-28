package com.pgroomapp.controllers;

import com.pgroomapp.model.Room;
import com.pgroomapp.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room-api")
public class RoomController {

    @Autowired
    IRoomService roomService;

    @PostMapping("/room")
    public ResponseEntity<Void> addRoom(@RequestBody Room room){
        roomService.addRoom(room);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/room")
    ResponseEntity<Void> updateRoom(@RequestBody Room room){
        roomService.updateRoom(room);
        return ResponseEntity.status(HttpStatus.FOUND).build();
    }

    @GetMapping("/room")
    ResponseEntity<List<Room>> getAllRooms(){
        HttpHeaders headers=new HttpHeaders();
        headers.add("info","Getting the list of Rooms");
        return ResponseEntity.ok().headers(headers).body(roomService.getAll());
    }

    @DeleteMapping("/room/{roomNumber}")
    ResponseEntity<Void> deleteRoom(@PathVariable("roomNumber") Integer roomNumber){
        roomService.deleteRoom(roomNumber);
        return ResponseEntity.status(HttpStatus.GONE).build();
    }

    @GetMapping("/room/{roomNumber}")
    ResponseEntity<Room> getById(@PathVariable("roomNumber") Integer roomNumber){
        HttpHeaders headers=new HttpHeaders();
        headers.add("info","Getting Room by Room Number");
        Room room=roomService.getById(roomNumber);
        return ResponseEntity.ok().headers(headers).body(room);
    }

    @GetMapping("/room/getbyroomsharingtype/{roomSharingType}")
    ResponseEntity<List<Room>> getRoomBySharingType(@PathVariable("roomSharingType") Integer roomSharingType){
        HttpHeaders headers=new HttpHeaders();
        headers.add("info","Getting Room by Room Sharing Type");
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(roomService.getByRoomSharingType(roomSharingType));

    }

    @GetMapping("/room/getbyrentperperson/{rentPerPerson}")
    ResponseEntity<List<Room>> getRoomByRentPerPerson(@PathVariable("rentPerPerson") Double rentPerPerson){
        HttpHeaders headers=new HttpHeaders();
        headers.add("info","Getting Room by Room Rent Per Person");
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(roomService.getByRentPerPerson(rentPerPerson));

    }

    @GetMapping("/room/getbywifi/{wifi}")
    ResponseEntity<List<Room>> getRoomByWifi(@PathVariable("wifi") Boolean wifi){
        HttpHeaders headers=new HttpHeaders();
        headers.add("info","Getting Room with wifi facility");
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(roomService.getByWifi(wifi));

    }

    @GetMapping("/room/getbybalcony/{balcony}")
    ResponseEntity<List<Room>> getRoomByBalcony(@PathVariable("balcony") Boolean balcony){
        HttpHeaders headers=new HttpHeaders();
        headers.add("info","Getting room with balcony facility");
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(roomService.getByBalcony(balcony));
    }

    @GetMapping("/room/getbyCleaningService/{roomCleaningService}")
    ResponseEntity<List<Room>> getRoomByCleaningService(@PathVariable("roomCleaningService") Boolean roomCleaningService){
        HttpHeaders headers=new HttpHeaders();
        headers.add("info","Getting room with room cleaning Service");
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(roomService.getByRoomCleaningService(roomCleaningService));

    }

    @GetMapping("/room/getbywifiandbalcony/{wifi}/{balcony}")
    ResponseEntity<List<Room>> getRoomByWifiAndBalcony(@PathVariable("wifi") Boolean wifi,@PathVariable("balcony") Boolean balcony){
        HttpHeaders headers=new HttpHeaders();
        headers.add("info","Getting room with wifi and balcony");
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(roomService.getByBalconyAndWifi(balcony,wifi));

    }

    @GetMapping("/room/getbyroomcolor/{wallColor}")
    ResponseEntity<List<Room>> getRoomByWallColor(@PathVariable("wallColor") String wallColor){
        HttpHeaders headers=new HttpHeaders();
        headers.add("info","Getting room with wall color");
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(roomService.getByWallColor(wallColor));

    }


}
