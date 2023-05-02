package com.knoldus.javastudio.services;



import com.knoldus.javastudio.entities.Mentor;

import java.util.List;


public interface JavaMentorService {
    Mentor saveMentorDetails(Mentor mentor);

    Mentor getMentorById(String mentorId);

    List<Mentor> getAllMentorDetails();
}
