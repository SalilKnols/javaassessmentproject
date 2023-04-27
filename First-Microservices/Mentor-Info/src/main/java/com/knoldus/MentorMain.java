package com.knoldus;

import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MentorMain {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}