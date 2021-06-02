package com.fatec.epopet.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorEnum {

    ENTITY_NOT_FOUND("Entity not found!", 1),
    ENTITY_ALREADY_EXISTS("Client already exists!", 2);

    private final String message;
    private final Integer errorCode;

}
