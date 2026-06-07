package com.practice.Code.pr2.handler;


import com.practice.Code.pr2.dto.CustomEx;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> HandleGlobalException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("message",e.getMessage());
        map.put("time", LocalDateTime.now());
        map.put("statusCode",HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @ExceptionHandler(CustomEx.class)
    public ResponseEntity<Object> HandleCustomException(CustomEx ex){
        Map<String,Object> map = new HashMap<>();
        map.put("message",ex.getMessage());
        map.put("time", LocalDateTime.now());
        map.put("statusCode",ex.getStatusCode());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }


}
