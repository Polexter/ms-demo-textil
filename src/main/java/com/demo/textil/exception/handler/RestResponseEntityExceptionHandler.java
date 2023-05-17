package com.demo.textil.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.demo.textil.exception.NotFoundException;
import com.demo.textil.responses.ApiDataResponse;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ApiDataResponse<Object>> handleNotFound(final NotFoundException exception) {
        return new ResponseEntity<>(ApiDataResponse.builder()
        		.data(null)
                .code(HttpStatus.NOT_FOUND.value()).build(),
        HttpStatus.NOT_FOUND);
    }

}
