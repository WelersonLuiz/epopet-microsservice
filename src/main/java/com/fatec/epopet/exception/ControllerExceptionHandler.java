package com.fatec.epopet.exception;

import com.fatec.epopet.model.ErrorResponse;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import static com.fatec.epopet.enumeration.ErrorEnum.ENTITY_NOT_FOUND;
import static com.fatec.epopet.enumeration.ErrorEnum.ENTITY_ALREADY_EXISTS;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler({
            EntityNotFoundException.class,
            EmptyResultDataAccessException.class
    })
    public ResponseEntity<ErrorResponse> handleEntityNotFoundException() {
        return new ResponseEntity<>(new ErrorResponse(ENTITY_NOT_FOUND), NOT_FOUND);
    }

    @ExceptionHandler({
            EntityExistsException.class
    })
    public ResponseEntity<ErrorResponse> handleEntityExistsException() {
        return new ResponseEntity<>(new ErrorResponse(ENTITY_ALREADY_EXISTS), BAD_REQUEST);
    }

}
