package com.curso.spring.services.exception;

public class ObjectNotfoundException extends RuntimeException {

    public ObjectNotfoundException(String msg){
        super(msg);
    }

}
