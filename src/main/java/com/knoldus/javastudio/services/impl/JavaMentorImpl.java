package com.knoldus.javastudio.services.impl;


import com.knoldus.javastudio.entities.Mentor;
import com.knoldus.javastudio.exceptions.ResourceNotFoundException;
import com.knoldus.javastudio.repositories.JavaMentorRepository;
import com.knoldus.javastudio.services.JavaMentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JavaMentorImpl implements JavaMentorService {


    @Autowired
    private JavaMentorRepository javaMentorRepository;

    @Override
    public Mentor saveMentorDetails(Mentor mentor) {
        return javaMentorRepository.save(mentor);
    }

    @Override
    public List<Mentor> getAllMentorDetails() {
        return javaMentorRepository.findAll();
    }

    @Override
    public Mentor getMentorById(String mentorId) {
        return javaMentorRepository.findById(mentorId).orElseThrow(() -> new ResourceNotFoundException("no data found"));
    }
}


//
//    @Override
//    public JavaStudio saveStudioDetails(JavaStudio javaStudio) {
//        String randomEmployeeId = UUID.randomUUID().toString();
//        javaStudio.setId(randomEmployeeId);
//        return javaStudioRepository.save(javaStudio);
//    }
//
//    @Override
//    public List<JavaStudio> getAllDetails() {
//        return javaStudioRepository.findAll();
//    }
//
//    @Override
//    public JavaStudio getMentorByID(String studioEmployeeId) {
//        return javaStudioRepository.findById(studioEmployeeId).orElseThrow(() -> new ResourceNotFoundException("no data found"));
//    }
//    @Override
//    public JavaStudio getInternByID(String studioEmployeeId) {
//        return javaStudioRepository.findById(studioEmployeeId).orElseThrow(() -> new ResourceNotFoundException("no data found"));
//    }
//}
