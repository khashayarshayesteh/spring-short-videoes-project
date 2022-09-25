package com.canon.service;

import com.canon.repository.JavaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JavaService {
    private final ExtraSessions officeHours;
    private final ExtraSessions mentorHours;
    private final JavaRepository javaRepository;

    public JavaService(@Qualifier("Office") ExtraSessions officeHours,@Qualifier("Mentor") ExtraSessions mentorHours, JavaRepository javaRepository) {
        this.officeHours = officeHours;
        this.mentorHours = mentorHours;
        this.javaRepository = javaRepository;
    }

    public void getTeachingHours(){
        System.out.println("weekly java hours: " + (javaRepository.returnHours()+
                officeHours.getHours()+ mentorHours.getHours()));
    }
}
