package com.canon.dependency_injection;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor // we can use Lombok instead of construction.
public class Java {
    OfficeHours officeHours;

   // @Autowired  //New Intellij doesnt need @Autowired, only construction is enough.
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}
