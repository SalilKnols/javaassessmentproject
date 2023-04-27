/*
package com.knoldus.dao;

import com.knoldus.model.Mentor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MentorRepository.class)
class MentorRepositoryTest {
    @Autowired
    private MentorRepository mentorRepository;

    @Test
    public void saveMentorsDetail() {

        Mentor intern = Mentor.builder()
                .name("Sakshi Mittal")
                .email("sakshi.mittal@knoldus.com")
                .department("Java Studio")
                .workExperience("2.3")
                .build();
        mentorRepository.save(intern);
    }
}*/
