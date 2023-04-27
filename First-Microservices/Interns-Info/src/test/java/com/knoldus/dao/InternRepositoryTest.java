package com.knoldus.dao;

import com.knoldus.model.Intern;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InternRepositoryTest {
    @Autowired
    private InternRepository internRepository;

    @Test
    public void saveInternsDetail() {

        Intern intern = Intern.builder()
                .name("xys")
                .email("jkb.kumar@knoldus.com")
                .department("Java Studio")
                .workExperience("0")
                .build();
        internRepository.save(intern);
    }

}
