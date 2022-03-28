package com.pgroomapp.exceptions;

public class BranchNotFoundException extends RuntimeException{
    public BranchNotFoundException() {
    }

    public BranchNotFoundException(String message) {
        super(message);
    }
}
