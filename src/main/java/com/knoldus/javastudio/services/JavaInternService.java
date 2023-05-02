package com.knoldus.javastudio.services;



import com.knoldus.javastudio.entities.Intern;

import java.util.List;

public interface JavaInternService {

    Intern saveInternDetails(Intern intern);

    Intern getInternById(String studioInternId);

    List<Intern> getAllInternDetails();
}
