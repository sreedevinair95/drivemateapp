package com.drivemate.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MyApplication {
    @RequestMapping("/register")
    String register(String studentName, Integer studentAge) {

        return "Student of name " +studentName+ " and age " +studentAge+ "has been registered";
    }

    @RequestMapping("/List")
    String List(){
        return "hello";
    }


    @RequestMapping("/search")
        String search(String studentSearch) {
        return studentSearch+" is present";
    }
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
