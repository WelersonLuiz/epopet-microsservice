package com.fatec.epopet.model;

import com.fatec.epopet.enumeration.ErrorEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {

    private int errorCode;
    private String message;

    public ErrorResponse(ErrorEnum errorEnum) {
        this.errorCode = errorEnum.getErrorCode();
        this.message = errorEnum.getMessage();
    }
}
