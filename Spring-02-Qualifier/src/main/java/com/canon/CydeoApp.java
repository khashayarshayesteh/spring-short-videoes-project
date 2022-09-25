package com.canon;

import com.canon.config.ConfigApp;
import com.canon.service.JavaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CydeoApp {

   // public static void main(String[] args) {
      //  SpringApplication.run(CydeoApp.class, args);
   public static void main(String[] args) {
       ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);
       JavaService java = container.getBean(JavaService.class);
       java.getTeachingHours();

   }

}
