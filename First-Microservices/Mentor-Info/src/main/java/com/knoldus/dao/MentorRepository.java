package com.knoldus.dao;

import com.knoldus.model.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MentorRepository  extends JpaRepository<Mentor,Long> {

    @Override
    Optional<Mentor> findById(Long id);
}
