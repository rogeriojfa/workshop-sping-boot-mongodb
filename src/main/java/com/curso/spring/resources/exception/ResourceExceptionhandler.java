package com.curso.spring.resources.exception;

import com.curso.spring.services.exception.ObjectNotfoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionhandler {

    @ExceptionHandler(ObjectNotfoundException.class)
    public ResponseEntity<StandardError> objetcNotFound(ObjectNotfoundException e, HttpServletRequest request){

        HttpStatus status = HttpStatus.NOT_FOUND;

        StandardError err = new StandardError(System.currentTimeMillis(),
                status.value(),
                "Não Encontrado",
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }
}
