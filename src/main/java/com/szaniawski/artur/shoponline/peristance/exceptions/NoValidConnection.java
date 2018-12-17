package com.szaniawski.artur.shoponline.peristance.exceptions;
public class NoValidConnection extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public NoValidConnection() {
        super();
    }

    public NoValidConnection(String message) {
        super(message);
    }
}