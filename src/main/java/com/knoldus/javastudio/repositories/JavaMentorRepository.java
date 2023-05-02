package com.knoldus.javastudio.repositories;

import com.knoldus.javastudio.entities.Mentor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaMentorRepository extends JpaRepository<Mentor, String> {

}

