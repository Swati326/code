package com.practice.Code.qualifier;

import org.springframework.stereotype.Service;

@Service
public class Cricket implements Sport{
    @Override
    public String name() {
        return "cricket";
    }

    @Override
    public Integer Player() {
        return 11;
    }
}
