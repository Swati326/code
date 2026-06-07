package com.practice.Code.qualifier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SportController {

    @Autowired
    @Qualifier("cricket")
    public Sport sport;

    @GetMapping("/get-sport")
    public String getSort()
    {
        return sport.name();
    }

}

//if there are multiple bean define with same type in case spring get confuse which to get inject and creates ambuiguity
// in such case qualifier is used to define to inject partculer bean.
// Qualifier always work with @Auutowired annotation
// if we define @Primary annotation then spring take priority to that bean to inject if there is no qualifier annotation.
// but qualifier + primary both are working together in that case spring give first priority to qualifier annotated bean.
