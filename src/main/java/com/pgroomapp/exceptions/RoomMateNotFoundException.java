package com.pgroomapp.exceptions;

public class RoomMateNotFoundException extends RuntimeException{
    public RoomMateNotFoundException() {
    }

    public RoomMateNotFoundException(String message) {
        super(message);
    }
}
