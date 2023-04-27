package com.knoldus.dao;

import com.knoldus.model.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InternRepository extends JpaRepository<Intern,Long> {

    Optional<Intern> findById(Long id);
}
