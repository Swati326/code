package com.practice.Code.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class KhoKho implements Sport{
    @Override
    public String name() {
        return "khokho";
    }

    @Override
    public Integer Player() {
        return 7;
    }
}
