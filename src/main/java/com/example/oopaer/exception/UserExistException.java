package com.example.oopaer.exception;

public class UserExistException extends Exception {
    public UserExistException(String failure){
        super(failure);
    }
}
