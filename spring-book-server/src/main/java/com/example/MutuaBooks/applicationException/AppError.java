package com.example.MutuaBooks.applicationException;

import java.time.LocalDateTime;

public record AppError(
        String path,
        String message,
        int statusCode,
        LocalDateTime localDateTime
) {
}
