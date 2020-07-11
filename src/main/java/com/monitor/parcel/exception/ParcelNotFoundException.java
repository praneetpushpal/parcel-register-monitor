package com.monitor.parcel.exception;

public class ParcelNotFoundException extends RuntimeException {
    public ParcelNotFoundException(String message) {
        super(message);
    }
}
