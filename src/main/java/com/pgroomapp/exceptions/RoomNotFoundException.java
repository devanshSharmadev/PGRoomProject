package com.pgroomapp.exceptions;

public class RoomNotFoundException extends RuntimeException {
    public RoomNotFoundException() {
    }

    public RoomNotFoundException(String message) {
        super(message);
    }
}
