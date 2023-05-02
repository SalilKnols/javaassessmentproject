package com.knoldus.javastudio.controller;


import com.knoldus.javastudio.entities.Mentor;
import com.knoldus.javastudio.services.JavaMentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mentors")
public class JavaMentorController {

    @Autowired
    private JavaMentorService javaMentorService;

    @PostMapping("/mentordetails")
    public ResponseEntity<Mentor> createMentor(@RequestBody Mentor javastudio) {
        Mentor mentor1 = javaMentorService.saveMentorDetails(javastudio);
        return ResponseEntity.status(HttpStatus.CREATED).body(mentor1);
    }

    @GetMapping("/allmentor")
    public ResponseEntity<List<Mentor>> getAllMentors() {
        List<Mentor> allMentors = javaMentorService.getAllMentorDetails();
        return ResponseEntity.ok(allMentors);
    }

    @GetMapping("/{mentorid}")
    public ResponseEntity<Mentor> getMentorDetails(@PathVariable String mentorId) {
        Mentor mentor = javaMentorService.getMentorById(mentorId);
        return ResponseEntity.ok(mentor);
    }

}
