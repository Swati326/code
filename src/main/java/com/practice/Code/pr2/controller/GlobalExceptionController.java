package com.practice.Code.pr2.controller;


import com.practice.Code.pr2.dto.CustomEx;

import com.practice.Code.pr2.handler.GlobalExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GlobalExceptionController {

    @Autowired
    GlobalExceptionHandler globalExceptionHandler;

    @PostMapping("/arithmeticException/{i}")
    public int generateCustomException(@PathVariable int i)
    {
        int p=i/0;
        return p;
    }

    @PostMapping("/nullpointer")
    public boolean generateCustomException()
    {
        String value=null;
         boolean v=value.equalsIgnoreCase("notnull");
        return v;
    }

    @PostMapping("/nullpointer/{name}")
    public Object generateCustomException(@PathVariable("name") String name ) throws CustomEx {

        if (name.equalsIgnoreCase("poi")) {
           throw new CustomEx("Name Should not be 'poi", 400);
        } else {
            return name;
        }
    }


}
