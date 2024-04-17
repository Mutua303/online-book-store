package com.example.MutuaBooks.applicationException;

public class BadRequestException  extends RuntimeException  {
    public BadRequestException(String message) {
        super(message);
    }
}
