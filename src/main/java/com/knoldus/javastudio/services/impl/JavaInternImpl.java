package com.knoldus.javastudio.services.impl;

import com.knoldus.javastudio.entities.Intern;
import com.knoldus.javastudio.exceptions.ResourceNotFoundException;
import com.knoldus.javastudio.repositories.JavaInternRepository;
import com.knoldus.javastudio.services.JavaInternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JavaInternImpl implements JavaInternService {

    @Autowired
    private JavaInternRepository javaInternRepository;

    @Override
    public Intern saveInternDetails(Intern intern) {
        return null;
    }

    @Override
    public Intern getInternById(String studioInternId) {
        return javaInternRepository.findById(studioInternId).orElseThrow(() -> new ResourceNotFoundException("no data found"));
    }

    @Override
    public List<Intern> getAllInternDetails() {
        return javaInternRepository.findAll();
    }
}
