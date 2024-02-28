package com.bilgeadam.lesson020;

import java.time.LocalDateTime;

public class NullCheckException extends Exception {

    private LocalDateTime localDateTime;

    public NullCheckException(String messaj) {
        super(messaj);
        this.localDateTime = LocalDateTime.now();
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
