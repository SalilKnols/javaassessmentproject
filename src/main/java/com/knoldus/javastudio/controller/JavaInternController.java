package com.knoldus.javastudio.controller;

import com.knoldus.javastudio.entities.Intern;
import com.knoldus.javastudio.services.JavaInternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/interns")
public class JavaInternController {

    @Autowired
    private JavaInternService javaInternService;

    @PostMapping("/interndetails")
    public ResponseEntity<Intern> createIntern(@RequestBody final Intern intern) {
        Intern intern1 = javaInternService.saveInternDetails(intern);
        return ResponseEntity.status(HttpStatus.CREATED).body(intern1);
    }
    @GetMapping("/{internId}")
    public ResponseEntity<Intern> getInternDetails(@PathVariable String internId) {
        Intern intern = javaInternService.getInternById(internId);
        return ResponseEntity.ok(intern);
    }

    @GetMapping("/allinterns")
    public ResponseEntity<List<Intern>> getAllMentors(){
        List<Intern> allInterns = javaInternService.getAllInternDetails();
        return ResponseEntity.ok(allInterns);
    }
}