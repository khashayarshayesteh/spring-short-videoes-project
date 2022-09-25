package com.canon.dependency_injection;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component


public class OfficeHours {

    public Integer getHours(){
        return 15;
    }
}
