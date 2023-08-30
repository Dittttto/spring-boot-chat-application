package com.example.chat.global.web.Exception;

import com.example.chat.global.web.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionHandler {

    @ExceptionHandler({CustomRuntimeException.class})
    public ResponseEntity<?> handleNoSuchElementException(
            CustomRuntimeException ex) {

        return new ResponseEntity<>(
                new ResponseDto<>(
                        ex.getMessage(),
                        null
                ),
                HttpStatus.NOT_FOUND
        );
    }
}
