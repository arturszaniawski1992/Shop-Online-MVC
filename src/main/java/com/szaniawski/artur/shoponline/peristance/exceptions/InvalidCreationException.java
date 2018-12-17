package com.szaniawski.artur.shoponline.peristance.exceptions;

public class InvalidCreationException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InvalidCreationException() {
        super();
    }

    public InvalidCreationException(String message) {
        super(message);
    }

}