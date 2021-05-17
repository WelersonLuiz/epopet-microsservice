package com.fatec.epopet.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorEnum {

    ENTITY_NOT_FOUND("Entity not found!", 1);

    private final String message;
    private final Integer errorCode;

}
