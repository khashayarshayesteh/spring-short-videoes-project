package com.canon.stereotype_annotation;

import com.canon.bean_annotation.FullTimeMentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

//        Java java = new Java();
//        java.getTeachingHours();

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCourse.class);

        Java java = container.getBean(Java.class);
        java.getTeachingHours();

        Agile agile = container.getBean(Agile.class);
        agile.getTeachingHours();

        FullTimeMentor fullTimeMentor = container.getBean(FullTimeMentor.class);
        fullTimeMentor.createAccount();

    }
}
